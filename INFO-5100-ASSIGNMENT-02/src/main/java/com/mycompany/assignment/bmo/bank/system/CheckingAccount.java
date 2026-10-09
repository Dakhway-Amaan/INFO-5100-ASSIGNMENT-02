/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class CheckingAccount extends NamedAccount  {
    
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String openedDate,
                           String nickname, double overdraftLimit) {
        super(accountNumber, balance, openedDate, nickname);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean writeCheck(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
    
}
