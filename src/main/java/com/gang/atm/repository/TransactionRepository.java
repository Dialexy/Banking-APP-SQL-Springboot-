package com.gang.atm.repository;

import com.gang.atm.model.Transaction;
import com.gang.atm.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Interface for Transaction
// Allows for CRUD operation
// provides search function by account number
// provides search function for accounts in descending order of time made (newest to oldest)

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByAccount(Account account);

    List<Transaction> findByAccountOrderByTimestampDesc(Account account);
}
