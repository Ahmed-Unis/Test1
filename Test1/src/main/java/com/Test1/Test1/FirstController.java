package com.Test1.Test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FirstController {
    
    @GetMapping("/Age")
    public String getAge(Model model){
        Age firstAge = new Age(1, 1, 2016);
        model.addAttribute("Age",firstAge);
        System.out.println("hi");
        return "age";
    }
    
}
