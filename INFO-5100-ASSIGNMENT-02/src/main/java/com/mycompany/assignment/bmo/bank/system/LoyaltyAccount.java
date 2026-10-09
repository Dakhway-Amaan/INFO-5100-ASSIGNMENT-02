/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class LoyaltyAccount {
    
    private String customerId;
    private String memberId;
    private String enrolledDate;
    private int points;

    public LoyaltyAccount(String customerId, String memberId, String enrolledDate) {
        this.customerId = customerId;
        this.memberId = memberId;
        this.enrolledDate = enrolledDate;
    }

    public void addPoints(int amount) {
        points = points + amount;
    }

    public void redeemPoints(int amount) {
        points = points - amount;
    }

    public int getPoints() {
        return points;
    }
    
}
