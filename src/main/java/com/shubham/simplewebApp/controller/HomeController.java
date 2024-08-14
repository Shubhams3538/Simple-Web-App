package com.shubham.simplewebApp.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Welcome to simple webpage";
    }
    @RequestMapping("/about")
    public String About(){
        return "This is a web application that i have not created yet!!";
    }
}
