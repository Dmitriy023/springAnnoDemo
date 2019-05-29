package com.controllers;

import com.commands.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
    public String saveStudent(@ModelAttribute Student student){

        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "process-form";
    }

}
