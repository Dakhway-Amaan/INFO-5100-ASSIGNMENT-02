/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class OtherBankClient extends Customer {
    private String bankName;
    private String externalClientId;
    private String clientName;
    private String contactInfo;

    public OtherBankClient(String customerId, String name, String email, String phone, String dateOfBirth,
                           String bankName, String externalClientId, String clientName, String contactInfo) {
        super(customerId, name, email, phone, dateOfBirth);
        this.bankName = bankName;
        this.externalClientId = externalClientId;
        this.clientName = clientName;
        this.contactInfo = contactInfo;
    }
    
    public String getBankName() {
        return bankName;
    }
}
