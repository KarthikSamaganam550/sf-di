package com.sfw.sfdi.controllers;

import com.sfw.sfdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
