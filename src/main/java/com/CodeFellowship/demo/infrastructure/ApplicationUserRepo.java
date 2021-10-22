package com.CodeFellowship.demo.infrastructure;


import com.CodeFellowship.demo.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepo extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findApplicationUserByUsername(String username);
}