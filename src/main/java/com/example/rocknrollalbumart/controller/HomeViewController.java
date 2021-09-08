package com.example.rocknrollalbumart.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ApiOperation(value = "display Home page",tags = "Album VIEW Controller")
@Controller
public class HomeViewController {

    @Value("static message")
    private String greetingMessage;

    @RequestMapping("/home")
    public String welcome(){
        System.out.println(greetingMessage);
        return "index";
    }

}
