/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Customer {
    
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String dateOfBirth;

    public Customer(String customerId, String name, String email, String phone, String dateOfBirth) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactInfo() {
        return "\nName: " + name + ", Email: " + email + ", Phone Number: " + phone;
    }

    public String updateCustomerInfo(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        return getContactInfo();
    }

    public String getName() {
        return name;
    }
    
}
