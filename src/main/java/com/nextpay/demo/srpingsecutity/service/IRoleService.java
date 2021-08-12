package com.nextpay.demo.srpingsecutity.service;

import com.nextpay.demo.srpingsecutity.entity.Role;

public interface IRoleService extends IGeneralService<Role>{
    Role findByName(String nane);
}
