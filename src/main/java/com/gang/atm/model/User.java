package com.gang.atm.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Account> accounts;

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long newId) {
        this.id = newId;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }



    public String getRole() {
        return role;
    }

    public void setRole(String newRole) {
        this.role = newRole;
    }



    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
