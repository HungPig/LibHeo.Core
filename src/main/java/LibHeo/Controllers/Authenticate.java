/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibHeo.Controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Authenticate {

    private static final String FILE_PATH = "./database/users.txt";

    public static boolean authenticate(String identifier, String password, String role) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length == 3) {
                    String fileIDOrUsername = userDetails[0];
                    String filePassword = userDetails[1];
                    String fileRole = userDetails[2];
                    System.out.println("Debug: File Data - " + fileIDOrUsername + ", " + filePassword + ", " + fileRole);
                    if (fileRole.equals("student") && fileIDOrUsername.equals(identifier) && filePassword.equals(password)) {
                        return true;
                    }
                    if (fileRole.equals("admin") && fileIDOrUsername.equals(identifier) && filePassword.equals(password)) {
                        return true;
                    } else 
                    {
                         System.out.println("Debug: File Data - " + fileIDOrUsername + ", " + filePassword + ", " + fileRole);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Đăng nhập thất bại
    }
}
