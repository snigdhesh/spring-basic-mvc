package com.example.springbasics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap model) {
        model.addAttribute("message","You are in UserController");
        return "users";
    }
}
