/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibHeo.Controllers;

import LibHeo.Application.Admin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Authenticate {

    public Authenticate() {
    }

    private static final String FILE_PATH = "./database/users.txt";
    private static Admin currentAdmin = null;

    public static boolean authenticate(String identifier, String password, String role) {
        // Đường dẫn tới file chứa thông tin người dùng
        String FILE_PATH = "./database/Student.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            // Đọc từng dòng trong file
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(",");

                // Kiểm tra cấu trúc dòng dữ liệu
                if (userDetails.length >= 3) {
                    String fileIdorUsername = userDetails[0].trim();  // ID hoặc username
                    String filePassword = userDetails[1].trim();      // Mật khẩu
                    String fileRole = userDetails[2].trim();          // Vai trò (admin, student,...)

                    // Kiểm tra nếu id/username, mật khẩu và vai trò khớp với thông tin đăng nhập
                    if (fileIdorUsername.equals(identifier) && filePassword.equals(password) && fileRole.equals(role)) {
                        return true; // Nếu đúng, trả về true (đăng nhập thành công)
                    }
                } else {
                    // Ghi log khi dòng không đúng định dạng
                    System.out.println("Dòng không hợp lệ trong file người dùng: " + line);
                }
            }
        } catch (IOException e) {
            // Xử lý lỗi khi không thể đọc file
            System.err.println("Lỗi khi đọc file người dùng: " + e.getMessage());
            e.printStackTrace();
        }

        // Nếu không tìm thấy người dùng với thông tin phù hợp, trả về false
        return false;
    }

    public static Admin getCurrentAdmin() {
        return currentAdmin;
    }

    public static boolean registerAdmin(String username, String password, String fullName, String dateOfBirth, String address) {
        String role = "admin";
        String userRecord = String.join(",", username, password, role, fullName, dateOfBirth, address);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(userRecord);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean changePassword(String identifier, String oldPassword, String newPassword, String role) {
        File inputFile = new File("./database/users.txt");
        File tempFile = new File("./database/users_temp.txt");

        boolean isPasswordChanged = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length >= 3) {
                    String fileIDen = userDetails[0];
                    String filePassword = userDetails[1];
                    String fileRole = userDetails[2];

                    if (fileIDen.equals(identifier) && filePassword.equals(oldPassword) && fileRole.equals(role)) {
                        // Đổi mật khẩu
                        writer.write(fileIDen + " " + filePassword + " " + fileRole);
                        isPasswordChanged = true;
                    } else {
                        // Ghi lại dòng không thay đổi
                        writer.write(line);
                    }
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (isPasswordChanged) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
        } else {
            tempFile.delete();
        }

        return isPasswordChanged;
    }

}
