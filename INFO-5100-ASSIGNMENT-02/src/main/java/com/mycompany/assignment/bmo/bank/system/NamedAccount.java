/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment.bmo.bank.system;

/**
 *
 * @author amaan
 */
public class NamedAccount extends Account {
    private String nickname;

    public NamedAccount(String accountNumber, double balance, String openedDate, String nickname) {
        super(accountNumber, balance, openedDate);
        this.nickname = nickname;
    }

    public void setNickname(String name) {
        nickname = name;
    }

    public String getNickname() {
        return nickname;
    }
}
