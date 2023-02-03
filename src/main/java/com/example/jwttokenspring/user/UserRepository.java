package com.example.jwttokenspring.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author 1ommy
 * @version 03.02.2023
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
