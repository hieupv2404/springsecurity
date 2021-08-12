package com.nextpay.demo.srpingsecutity.service;

import com.nextpay.demo.srpingsecutity.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserDetailService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
