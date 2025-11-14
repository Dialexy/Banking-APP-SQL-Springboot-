package com.gang.atm.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String pin;
    private String accountNumber;

    private double balance;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

    public Account() {}

    public Long getId() {
        return id;
    }

    public void setId(Long newId) {
        this.id = newId;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String newFullName) {
        this.fullName = newFullName;
    }



    public String getPin() {
        return pin;
    }

    public void setPin(String newPin) {
        this.pin = newPin;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }



    public List<Transaction> getTransactions() {
        return transactions;
    }
}
