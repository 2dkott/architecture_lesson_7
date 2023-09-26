package com.example.lesson_7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class home {

    private String title = "Тестовое название";

    @GetMapping
    public String init(Model model) {
        model.addAttribute("name", title);
        return "index";
    }

    @PostMapping
    public String getTitle(@RequestParam(value = "title") String title, Model model) {
        model.addAttribute("name", title);
        return "index";
    }
}
