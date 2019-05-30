package com.controllers;

import com.commands.Student;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;


@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping(value = "/new")
    public String newStudent(Model model){
       model.addAttribute("student",new Student());
        return "student/student-form";
    }

    @RequestMapping("/save")
    @PostMapping
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult result){

        if(result.hasErrors()){
            return "student/student-form";
        }
        return "process-form";
    }

}
