/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Adult extends BmoBankClient {
    
    private String occupation;
    private String address;
    private String sinNumber;

    public Adult(String customerId, String name, String email, String phone, String dateOfBirth, String clientSince, String occupation, String address, String sinNumber) {
        super(customerId, name, email, phone, dateOfBirth, clientSince);
        this.occupation = occupation;
        this.address = address;
        this.sinNumber = sinNumber;
    }
    
    public String getOccupation() {
        return occupation;
    }
}
