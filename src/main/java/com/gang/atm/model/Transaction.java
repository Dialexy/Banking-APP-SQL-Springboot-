package com.gang.atm.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private double amount;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Transaction() {}

    public Long getId() {
        return id;
    }

    public void setId(Long newId) {
        this.id = newId;
    }



    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }



    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }



    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime newTimestamp) {
        this.timestamp = newTimestamp;
    }



    public Account getAccount() {
        return account;
    }

    public void setAccount(Account newAccount) {
        this.account = newAccount;
    }
}

