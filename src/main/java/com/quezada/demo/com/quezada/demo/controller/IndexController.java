package com.quezada.demo.com.quezada.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/","/index","/home"})
    public String index(){
        return "Index";
    }
}
