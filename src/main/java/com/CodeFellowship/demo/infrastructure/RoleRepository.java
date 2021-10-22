package com.CodeFellowship.demo.infrastructure;

import com.CodeFellowship.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // queries
    Optional<Role> findRoleByName(String name);
}
