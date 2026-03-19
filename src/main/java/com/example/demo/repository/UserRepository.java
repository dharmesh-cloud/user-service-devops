package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository; // ✅ FIXED

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}