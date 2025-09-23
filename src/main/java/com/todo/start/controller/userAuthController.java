package com.todo.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userAuth")
public class userAuthController {
    @GetMapping("/user")
    public String publicEndpoint() {
        return "Hello, User!";
    }
    @GetMapping("/Account")
    public String accountEndpoint() {
        return "Hello ! This is your account information.";
    }
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, Admin! This is the admin dashboard.";
    }   
    
    

}
