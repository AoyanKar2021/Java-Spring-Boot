package com.springboot.test.controller;

import com.springboot.test.dtos.Userdto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
    @GetMapping("/")
    public String showHome()
    {
         return "home";
    }
    @GetMapping("/contact")
    public String showcontactUS()
    {
        return "contact";
    }
    @GetMapping("/service")
    public String showServices()
    {
        return "services";
    }
    @GetMapping("/about")
    public String showAboutUS()
    {
        return "";
    }
    @GetMapping("/regestration")
    public String getUser( Model model)
    {
        Userdto udto=new Userdto();
        model.addAttribute("user",udto);
        return "regestration";
    }
    @GetMapping("/login")
    public String showLogin()
    {
        return "login";
    }
}
