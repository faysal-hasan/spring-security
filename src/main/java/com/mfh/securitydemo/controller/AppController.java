package com.mfh.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        return "home";
    }

    @RequestMapping("/hello")
    public String viewHelloage(Model model) {
        return "hello";
    }

    @RequestMapping("/login")
    public String viewLoginPage(Model model) {
        return "login";
    }
}
