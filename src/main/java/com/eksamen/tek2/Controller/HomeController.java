package com.eksamen.tek2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        return "index";
        //Hej Jon og Kristoffer Dette er en CICD tester

    }
}