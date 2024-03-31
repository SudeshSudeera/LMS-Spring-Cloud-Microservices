package com.devstack.lms.subjectserviceapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
public class WebClientConfig {
    @Bean
    public JwtDecoder jwtDecoder() {
        String issuerUri = "http://localhost:8000/realms/lms";
        return NimbusJwtDecoder.withIssuerLocation(issuerUri).build();
    }
}
