package com.laszloborbely.spring_demo_security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecretController {
    @RequestMapping(value = "/secret", method = RequestMethod.GET)
    public String showForm() {
        return "secret";
    }
}
