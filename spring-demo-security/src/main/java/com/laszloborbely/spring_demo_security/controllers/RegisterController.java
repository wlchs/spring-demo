package com.laszloborbely.spring_demo_security.controllers;

import com.laszloborbely.spring_demo_security.user.ApplicationUser;
import com.laszloborbely.spring_demo_security.user.ApplicationUserRepository;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
    private ApplicationUserRepository userRepository;

    public void setUserRepository(ApplicationUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute ApplicationUser user) {
        user.setRole("ROLE_USER");
        userRepository.save(user);

        Authentication auth = new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getRoles());
        SecurityContextHolder.getContext().setAuthentication(auth);

        return "redirect:/secret";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String goRegister() {
        return "register";
    }
}
