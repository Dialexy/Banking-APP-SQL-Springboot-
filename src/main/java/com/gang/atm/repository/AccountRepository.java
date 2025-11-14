package com.gang.atm.repository;

import com.gang.atm.model.Account;
import com.gang.atm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

// Interface for Account
// Allows for Custom CRUD operations
// Implements a single custom query

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByUser(User user);

    Optional<Account> findByAccountNumber(String accountNumber);

    @Query("SELECT a FROM Account a WHERE a.user.id = :userId AND a.balance >= :minBalance")
    List<Account> findAccountsByUserIdAndMinBalance(@Param("userId") Long userId, @Param("minBalance") double minBalance);

    List<Account> findByBalanceGreaterThan(double amount);

    List<Account> findByBalanceLessThan(double amount);
}
