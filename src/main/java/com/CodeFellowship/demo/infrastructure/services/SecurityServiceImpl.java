package com.CodeFellowship.demo.infrastructure.services;

import com.CodeFellowship.demo.infrastructure.RoleRepository;
import com.CodeFellowship.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("securityService")
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role findRoleById(Long roleId) {
        return roleRepository.findById(roleId).orElseThrow();
    }

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findRoleByName(name).orElseThrow();
    }
}
