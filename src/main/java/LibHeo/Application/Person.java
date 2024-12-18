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
public class Person {
    protected String username;
    protected String password;
    protected Date NgaySinh;
    protected String DiaChi;
    protected String gioiTinh;

    public Person(String username, String password, Date NgaySinh, String DiaChi, String gioiTinh) {
        this.username = username;
        this.password = password;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.gioiTinh = gioiTinh;
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
