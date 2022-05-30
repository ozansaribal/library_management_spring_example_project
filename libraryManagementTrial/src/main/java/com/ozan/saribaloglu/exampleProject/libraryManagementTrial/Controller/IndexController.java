package com.ozan.saribaloglu.exampleProject.libraryManagementTrial.Controller;

import org.springframework.web.bind.annotation.GetMapping;


public class IndexController {

    @GetMapping("/")
    public String listHome(){

        return "index";

    }

}
