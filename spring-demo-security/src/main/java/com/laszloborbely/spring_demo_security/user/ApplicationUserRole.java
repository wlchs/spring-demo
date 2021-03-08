package com.laszloborbely.spring_demo_security.user;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ApplicationUserRole implements GrantedAuthority {
    @Id
    @GeneratedValue
    private Long id;

    private String role;

    public ApplicationUserRole() {
    }

    public ApplicationUserRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }

    public void setAuthority(String role) {
        this.role = role;
    }
}
