package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/","home"}) // localhost: 8080  localhost:8080/ localhost:8080/home
    public String getHome(){

        return "/home";
    }

}
