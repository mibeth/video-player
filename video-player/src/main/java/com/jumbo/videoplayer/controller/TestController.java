package com.jumbo.videoplayer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/idle")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

}