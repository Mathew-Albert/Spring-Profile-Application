package com.ust.springprofileapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Profile(value = "dev")
    @Bean
    public void devConfig() {
        System.out.println("Succesfully loaded the development Profile.");
    }

    @Profile(value = "test")
    @Bean
    public void testConfig() {
        System.out.println("Succesfully loaded the testing Profile.");
    }

    @Profile(value = "prod")
    @Bean
    public void prodConfig() {
        System.out.println("Succesfully loaded the Production Profile.");
    }
}
