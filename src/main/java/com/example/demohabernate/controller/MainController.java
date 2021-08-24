package com.example.demohabernate.controller;

import com.example.demohabernate.form.PersonAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showLogin(Model model){
        PersonAccount personAccount = new PersonAccount();
        model.addAttribute("personAccount", personAccount);
        return "login";
    }
}
