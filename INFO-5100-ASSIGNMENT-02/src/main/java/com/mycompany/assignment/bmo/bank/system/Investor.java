/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Investor extends Adult {
    
    private double portfolioValue;

    public Investor(String customerId, String name, String email, String phone, String dateOfBirth, String clientSince, String occupation, String address, String sinNumber, double portfolioValue) {
        super(customerId, name, email, phone, dateOfBirth, clientSince, occupation, address, sinNumber);
        this.portfolioValue = portfolioValue;
    }
    
    public double getPortfolioValue() {
        return portfolioValue;
    }
    
}
