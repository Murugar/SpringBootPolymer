package com.iqmsoft.boot.polymer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.boot.polymer.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByUsername(String username);
}
