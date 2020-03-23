package com.springTest.hibernate.controller;


import com.springTest.hibernate.form.Testphone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Index(){
        return "home/index";
    }


    @RequestMapping("/form")
    public String form( @ModelAttribute("phoneform") Testphone phone,ModelMap m){
        m.addAttribute("phoneform", phone);
        return "home/form";
    }

    @RequestMapping("/traitement")
    public String traiteForm(@Valid @ModelAttribute("phoneform") Testphone phone, BindingResult result){
        if(result.hasErrors()){
            System.out.println("======================================");
            System.out.println(result);
            return "home/form";
        }
        return "home/bien";
    }
}
