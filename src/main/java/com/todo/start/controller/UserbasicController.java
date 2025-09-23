package com.todo.start.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userbasic")
public class UserbasicController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Hello, User!";
    }
    @GetMapping("/account")
    public String accountEndpoint() {
        return "Hello ! This is your account information.";
    }
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, Admin! This is the admin dashboard.";
    }
    
    
}
