package com.example.product2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
public class Product2Application {

    public static void main(String[] args) {
        // This boots up the ApplicationContext, starts Tomcat, and keeps the app running
        SpringApplication.run(Product2Application.class, args);
    }
}
