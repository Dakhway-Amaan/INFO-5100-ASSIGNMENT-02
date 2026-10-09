/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Minor extends BmoBankClient {
    private int age;
    private String guardianType;
    private String guardianInformation;

    public Minor(String customerId, String name, String email, String phone, String dateOfBirth,
                 String clientSince, int age, String guardianType, String guardianInformation) {
        super(customerId, name, email, phone, dateOfBirth, clientSince);
        this.age = age;
        this.guardianType = guardianType;
        this.guardianInformation = guardianInformation;
    }
    
    public int getAge() {
        return age;
    }

    public void setGuardian(String name) {
        guardianInformation = name;
    }

    public String getGuardian() {
        return guardianInformation;
    }
}
