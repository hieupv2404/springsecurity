package com.nextpay.demo.srpingsecutity;

import com.nextpay.demo.srpingsecutity.entity.Role;
import com.nextpay.demo.srpingsecutity.entity.User;
import com.nextpay.demo.srpingsecutity.repo.IRoleRepository;
import com.nextpay.demo.srpingsecutity.repo.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SrpingsecutityApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SrpingsecutityApplication.class, args);
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IRoleRepository roleRepository;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("hieupv");
        user.setPassword(passwordEncoder.encode("1"));
        user.setFullName("Hieu PV");
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        roleRepository.save(role);
        Set<Role> roleSet = new HashSet<>(0);
        user.setRoles(roleSet);
        userRepository.save(user);
    }
}
