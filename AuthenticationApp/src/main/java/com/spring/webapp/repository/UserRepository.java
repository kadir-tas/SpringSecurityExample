package com.spring.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.webapp.model.User;

public interface UserRepository extends JpaRepository < User, String > {
    User findByUsername(String username);
}