package com.sfw.sfdi.controllers;

import com.sfw.sfdi.services.ConstructorGreetingServiceImpl;
import com.sfw.sfdi.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

   @BeforeEach
   void setup() {
       controller = new PropertyInjectorController();
       controller.greetingService = new PropertyGreetingServiceImpl();
   }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}