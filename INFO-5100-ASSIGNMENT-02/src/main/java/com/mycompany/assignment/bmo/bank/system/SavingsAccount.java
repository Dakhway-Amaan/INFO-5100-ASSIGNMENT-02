/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class SavingsAccount extends NamedAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String openedDate,
                          String nickname, double interestRate) {
        super(accountNumber, balance, openedDate, nickname);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}
