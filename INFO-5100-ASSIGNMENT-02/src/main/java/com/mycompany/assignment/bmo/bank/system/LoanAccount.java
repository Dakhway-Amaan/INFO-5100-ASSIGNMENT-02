/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class LoanAccount extends Account {
    
    private double interestRate;
    private double principalAmount;
    private int termMonths;

    public LoanAccount(String accountNumber, double balance, String openedDate,
                       double interestRate, double principalAmount, int termMonths) {
        super(accountNumber, balance, openedDate);
        this.interestRate = interestRate;
        this.principalAmount = principalAmount;
        this.termMonths = termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest() {
        return principalAmount * interestRate * termMonths / 12;
    }

    public void makeLoanPayment(double amount) {
        principalAmount = principalAmount - amount;
    }
    
    public double getPrincipalAmount() {
        return principalAmount;
    }
    
}
