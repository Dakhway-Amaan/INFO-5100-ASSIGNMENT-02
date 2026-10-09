/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class LargeBusiness extends Adult {
    
    private String corporateBusinessName;
    private String registrationNumber;

    public LargeBusiness(String customerId, String name, String email, String phone, String dateOfBirth,
                         String clientSince, String occupation, String address, String sinNumber,
                         String corporateBusinessName, String registrationNumber) {
        super(customerId, name, email, phone, dateOfBirth, clientSince, occupation, address, sinNumber);
        this.corporateBusinessName = corporateBusinessName;
        this.registrationNumber = registrationNumber;
    }
    
    public String getCorporateBusinessName() {
        return corporateBusinessName;
    }
    
}
