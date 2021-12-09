package com.sfw.sfdi.controllers;

import com.sfw.sfdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectorController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}