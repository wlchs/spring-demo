package com.laszloborbely.spring_demo_request.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoRequestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String request() {
        RestTemplate restTemplate = new RestTemplate();
        String requestURL = "http://localhost:8080/spring_demo_war_exploded/";
        return restTemplate.getForObject(requestURL, String.class);
    }
}
