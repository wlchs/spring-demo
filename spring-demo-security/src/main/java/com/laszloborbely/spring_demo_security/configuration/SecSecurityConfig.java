package com.laszloborbely.spring_demo_security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"/WEB-INF/spring/webSecurityConfig.xml"})
public class SecSecurityConfig {
    public SecSecurityConfig() {
        super();
    }
}
