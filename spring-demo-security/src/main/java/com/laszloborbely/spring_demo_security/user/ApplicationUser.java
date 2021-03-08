package com.laszloborbely.spring_demo_security.user;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class ApplicationUser implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String password;

    @OneToMany
    private final Collection<ApplicationUserRole> authorities;

    public ApplicationUser() {
        authorities = new ArrayList<>();
        authorities.add(new ApplicationUserRole("ROLE_ANONYMOUS"));
    }

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

    public Collection<ApplicationUserRole> getRoles() {
        return authorities;
    }
}
