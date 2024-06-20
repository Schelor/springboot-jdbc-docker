package com.springboot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie.Le
 * @since 2024/6/19
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class StartupApp {

    public static void main(String[] args) {
        SpringApplication.run(StartupApp.class, args);
    }
}
