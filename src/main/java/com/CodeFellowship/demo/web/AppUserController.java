package com.CodeFellowship.demo.web;

import com.CodeFellowship.demo.infrastructure.ApplicationUserRepository;
import com.CodeFellowship.demo.model.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AppUserController {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    BCryptPasswordEncoder encoder;


    @GetMapping("/signup")
    public String getSignUpPage() {
        return "signup";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping(value = "/signup")
    public RedirectView attemptSignUp(@RequestParam String username ,
                                      @RequestParam String password ,
                                      @RequestParam String firstname ,
                                      @RequestParam String lastname ,
                                      @RequestParam String dateofbirth ,
                                      @RequestParam String bio) {
        ApplicationUser newUser = new ApplicationUser(username , encoder.encode(password), firstname , lastname , dateofbirth , bio);

        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        applicationUserRepository.save(newUser);
        return new RedirectView("/");
    }


//    @GetMapping("/profile")
//    public String getProfilePage(Model model) {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute("username", userDetails.getUsername());
////        model.addAttribute("department", applicationUserRepository.findAppUserByUsername(userDetails.getUsername()).getDepartment());
//        return "profile";
//    }
}
