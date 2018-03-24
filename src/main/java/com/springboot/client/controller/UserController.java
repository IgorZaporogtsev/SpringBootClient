package com.springboot.client.controller;

import com.springboot.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URISyntaxException;

@Controller
@RequestMapping(value = "/user")
public class UserController {

   @Autowired
   private UserService userService;

    @RequestMapping
    public String getAllUser(Model model) throws URISyntaxException {
        model.addAttribute("getAllUser", this.userService.getAllUser());
        return "userPage";
    }
}

