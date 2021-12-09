package com.sfw.sfdi.controllers;

import com.sfw.sfdi.services.ConstructorGreetingServiceImpl;
import com.sfw.sfdi.services.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectorControllerTest {
    SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}