package com.jumbo.videoplayer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InitController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/idle")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

}
