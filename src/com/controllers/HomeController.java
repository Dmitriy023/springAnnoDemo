package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

//    @RequestMapping("/processForm")
//    public String processForm() {
//        return "process-form";
//    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName")String name, Model model) {
        model.addAttribute("message",name.toUpperCase());
        return "process-form";
    }
}
