/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class InvestmentAccount extends NamedAccount {
    
    private String riskProfile;

    public InvestmentAccount(String accountNumber, double balance, String openedDate,
                             String nickname, String riskProfile) {
        super(accountNumber, balance, openedDate, nickname);
        this.riskProfile = riskProfile;
    }

    public void buyAsset(String symbol, int qty) {
        System.out.println("Bought " + qty + " of " + symbol);
    }

    public void sellAsset(String symbol, int qty) {
        System.out.println("Sold " + qty + " of " + symbol);
    }
    
}
