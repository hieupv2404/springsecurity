package com.nextpay.demo.srpingsecutity.repo;

import com.nextpay.demo.srpingsecutity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long > {
    Role findRoleByName(String name);
}
