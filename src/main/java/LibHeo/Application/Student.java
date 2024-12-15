/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibHeo.Application;

/**
 *
 * @author Admin
 */
public class Student extends Person {
    private String Class;
    private String Major;

    public Student(String Class, String Major, int userID, String username, String password) {
        super(userID, username, password);
        this.Class = Class;
        this.Major = Major;
    }
    
}
