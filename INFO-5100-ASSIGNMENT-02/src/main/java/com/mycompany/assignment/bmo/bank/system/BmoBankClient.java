/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class BmoBankClient extends Customer {
    
    private String clientSince;

    public BmoBankClient(String customerId, String name, String email, String phone, String dateOfBirth, String clientSince) {
        super(customerId, name, email, phone, dateOfBirth);
        this.clientSince = clientSince;
    }

    public void openAccount(Account a) {
        System.out.println(getName() + " opened account " + a.getAccountNumber());
    }
    
    public String getClientSince() {
        return clientSince;
    }
}
