package com.example.LoginPUC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController -> APIs REST -> Back-end
// @Controller -> MVC -> Back-end + Front-end (Thymeleaf, React, etc.)

@Controller
public class SecureLoginController {
    // http://localhost:8080/login
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/recoverypassword")
    public String recoverypassword(){
        return "recoverypassword";
    }
}

// Para rodar o projeto mvn clean install e depois mvn spring-boot:run