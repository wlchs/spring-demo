package com.laszloborbely.spring_demo.controllers;

import com.laszloborbely.spring_demo.services.GreetingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(@RequestParam(name = "name", defaultValue = "World") String name) {
        return greetingService.greet(name);
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
