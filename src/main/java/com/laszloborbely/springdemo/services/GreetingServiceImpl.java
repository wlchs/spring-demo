package com.laszloborbely.springdemo.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
