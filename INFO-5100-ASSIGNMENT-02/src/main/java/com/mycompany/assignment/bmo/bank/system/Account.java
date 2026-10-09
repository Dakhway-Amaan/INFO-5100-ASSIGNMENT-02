/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Account {
    private String accountNumber;
    protected double balance;
    private String openedDate;

    public Account(String accountNumber, double balance, String openedDate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openedDate = openedDate;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
