package com.laszloborbely.spring_demo_security.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicationUser implements UserDetails {
    private final String userName;
    private final String password;
    private final Collection<GrantedAuthority> authorities;

    public ApplicationUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        authorities = new ArrayList<>();
        authorities.add(new ApplicationUserRole("ROLE_ANONYMOUS"));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setRole(String role) {
        authorities.add(new ApplicationUserRole(role));
    }

    public Collection<GrantedAuthority> getRoles() {
        return authorities;
    }
}
