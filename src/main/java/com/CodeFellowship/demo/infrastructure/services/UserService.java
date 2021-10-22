package com.CodeFellowship.demo.infrastructure.services;

import com.CodeFellowship.demo.model.ApplicationUser;


import java.util.List;

public interface UserService {
    ApplicationUser findApplicationUserByUsername(String username);

    List<ApplicationUser> findAll();

    ApplicationUser findById(Long id);

    void save(ApplicationUser applicationUser);
}
