package com.controllers;

import com.commands.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/new")
    public String getNewCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "customer/customer-form";
    }

    @PostMapping
    @RequestMapping("/save")
    public String saveCustomer(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult result){
        if(result.hasErrors()) {
            return "customer/customer-form";
        }
          return "customer/show-customer";
    }

}
