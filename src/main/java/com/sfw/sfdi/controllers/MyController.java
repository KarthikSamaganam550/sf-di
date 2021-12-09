package com.sfw.sfdi.controllers;

import com.sfw.sfdi.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller(value = "myc")
public class MyController {
    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  sayHello(){
        return greetingService.sayGreeting();
    }
}
