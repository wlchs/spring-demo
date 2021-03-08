package com.laszloborbely.spring_demo_security.user;

import org.springframework.security.core.GrantedAuthority;

public class ApplicationUserRole implements GrantedAuthority {
    private final String role;

    public ApplicationUserRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
