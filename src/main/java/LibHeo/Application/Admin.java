/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibHeo.Application;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Admin extends Person {
    private String fullname;
    private LocalDate  dateOfBirth;
    private Boolean Sex; //true == man false == girl, 
    private String Address;

    public Admin(String fullname, LocalDate dateOfBirth, Boolean Sex, String Address, int userID, String username, String password) {
        super(userID, username, password);
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.Sex = Sex;
        this.Address = Address;
    }

    public String getFullname() {
        return fullname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Boolean getSex() {
        return Sex;
    }

    public String getAddress() {
        return Address;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(Boolean Sex) {
        this.Sex = Sex;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
