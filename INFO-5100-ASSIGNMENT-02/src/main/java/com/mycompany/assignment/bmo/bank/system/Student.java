/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Student extends BmoBankClient {
    private String institution;
    private String studentId;

    public Student(String customerId, String name, String email, String phone, String dateOfBirth,
                   String clientSince, String institution, String studentId) {
        super(customerId, name, email, phone, dateOfBirth, clientSince);
        this.institution = institution;
        this.studentId = studentId;
    }
    
    public String getInstitution() {
        return institution;
    }
}
