/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class PointsTransaction {
    private String date;
    private int points;
    private String reason;

    public PointsTransaction(String date, int points, String reason) {
        this.date = date;
        this.points = points;
        this.reason = reason;
    }
    
    public int getPoints() {
        return points;
    }
}
