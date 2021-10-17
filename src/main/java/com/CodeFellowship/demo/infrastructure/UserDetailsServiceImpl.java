package com.CodeFellowship.demo.infrastructure;


import com.CodeFellowship.demo.model.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = applicationUserRepository.findAppUserByUsername(username);

        if (applicationUser == null) {
            System.out.print("Username not found");
            throw new UsernameNotFoundException((username + " not found"));
        }

        return (UserDetails) applicationUser;
    }
}
