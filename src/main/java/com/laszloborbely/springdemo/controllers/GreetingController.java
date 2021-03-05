package com.laszloborbely.springdemo.controllers;

import com.laszloborbely.springdemo.services.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "World") String name) {
        return greetingService.greet(name);
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("GreetingService injected!");
    }
}
