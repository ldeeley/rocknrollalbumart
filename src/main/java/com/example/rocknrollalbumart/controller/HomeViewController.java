package com.example.rocknrollalbumart.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ApiOperation(value = "display Home page",tags = "Album VIEW Controller")
@Controller
public class HomeViewController {

    @RequestMapping("/home")
    public static String welcome(){
        return "index";
    }

}
