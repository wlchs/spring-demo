package com.laszloborbely.spring_demo.services;

public class GreetingServiceImpl implements GreetingService {
    private String greetingPrefix;

    @Override
    public String greet(String name) {
        return greetingPrefix + name;
    }

    public void setGreetingPrefix(String greetingPrefix) {
        this.greetingPrefix = greetingPrefix;
    }
}
