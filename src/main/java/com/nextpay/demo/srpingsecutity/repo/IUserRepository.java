package com.nextpay.demo.srpingsecutity.repo;

import com.nextpay.demo.srpingsecutity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findUsersByUsername(String username);
}
