package com.CodeFellowship.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import java.util.ArrayList;
//import java.util.Date;

@Controller
public class Home {
//    @Autowired
//    SecurityService securityService;
//
//    @Autowired
//    BCryptPasswordEncoder encoder;
//
//    @Autowired
//    ApplicationUserRepo applicationUserRepo;

    //    @Autowired
//    RoleRepository roleRepository;
//    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/")
    public String homePage(){
//        Role userRole = new Role();
//        userRole.setName("USER");
//
//        Role adminRole = new Role();
//        adminRole.setName("ADMIN");
//
//        System.out.println(roleRepository.save(userRole).getName());
//        roleRepository.save(userRole);
//        roleRepository.save(adminRole);

//        ApplicationUser newApplicationUser = new ApplicationUser(encoder.encode("admin"),"admin","Mahmoud","Admin","ADMIN",new Date());
//
//        newApplicationUser.setRole(securityService.findRoleByName("ADMIN"));
//        newApplicationUser = applicationUserRepo.save(newApplicationUser);
//
//        Authentication authentication = new UsernamePasswordAuthenticationToken(newApplicationUser, null, new ArrayList<>());
//        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "index.html";
    }
}
