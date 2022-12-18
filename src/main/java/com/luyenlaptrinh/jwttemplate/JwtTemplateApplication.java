package com.luyenlaptrinh.jwttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.springframework.security.authentication", "com.luyenlaptrinh.jwttemplate"})
public class JwtTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtTemplateApplication.class, args);
    }

}
