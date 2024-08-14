package com.shubham.simplewebApp.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @RequestMapping("/login")
    public String login(){
        return "This is login page";
    }
}
