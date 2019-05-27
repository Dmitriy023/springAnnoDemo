package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = {"/", "", "/index"})
    public String indexPage() {

        return "index";
    }

    @RequestMapping({"/showForm","show"})
    public String showForm() {
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }
}
