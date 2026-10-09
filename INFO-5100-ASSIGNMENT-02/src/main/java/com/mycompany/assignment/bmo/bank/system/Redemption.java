/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class Redemption {
    private String redeemedDate;
    private int pointCost;
    private int pointsUsed;
    private String rewardId;
    private String description;

    public Redemption(String redeemedDate, int pointCost, int pointsUsed, String rewardId, String description) {
        this.redeemedDate = redeemedDate;
        this.pointCost = pointCost;
        this.pointsUsed = pointsUsed;
        this.rewardId = rewardId;
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}

