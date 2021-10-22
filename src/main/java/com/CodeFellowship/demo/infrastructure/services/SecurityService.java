package com.CodeFellowship.demo.infrastructure.services;


import com.CodeFellowship.demo.model.Role;

public interface SecurityService {

    Role findRoleById(Long roleId);
    Role findRoleByName(String name);
}

