package com.gang.atm.repository;

import com.gang.atm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Interface for User
// Allows custom CRUD operations 
// provides search function for indivdual users

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

