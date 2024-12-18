/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibHeo.Application;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person {

    private int StudentID;
    private String StudentClass;
    private String major;
    private String phone;
    private String email;

    public Student(int StudentID, String StudentClass, String major, String phone, String email, String username, String password, Date NgaySinh, String DiaChi, String gioiTinh) {
        super(username, password, NgaySinh, DiaChi, gioiTinh);
        this.StudentID = StudentID;
        this.StudentClass = StudentClass;
        this.major = major;
        this.phone = phone;
        this.email = email;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setStudentClass(String StudentClass) {
        this.StudentClass = StudentClass;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
