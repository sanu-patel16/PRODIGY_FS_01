package com.example.UserAuthentication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserAuthentication.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}


