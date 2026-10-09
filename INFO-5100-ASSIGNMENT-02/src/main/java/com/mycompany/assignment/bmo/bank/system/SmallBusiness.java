/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class SmallBusiness extends Adult {
    private String businessName;
    private int numberOfEmployees;

    public SmallBusiness(String customerId, String name, String email, String phone, String dateOfBirth,
                         String clientSince, String occupation, String address, String sinNumber,
                         String businessName, int numberOfEmployees) {
        super(customerId, name, email, phone, dateOfBirth, clientSince, occupation, address, sinNumber);
        this.businessName = businessName;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getBusinessName() {
        return businessName;
    }
}
