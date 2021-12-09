package com.sfw.sfdi;

import com.sfw.sfdi.controllers.ConstructorInjectorController;
import com.sfw.sfdi.controllers.MyController;
import com.sfw.sfdi.controllers.PropertyInjectorController;
import com.sfw.sfdi.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfDiApplication.class, args);
		MyController controller = (MyController) context.getBean("myc");
		String greeting = controller.sayHello();
		System.out.println(greeting);

		System.out.println("____Property");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		String greetingProp = propertyInjectorController.getGreeting();
		System.out.println(greetingProp);

		System.out.println("___Setter");
		SetterInjectorController setterInjectorController = (SetterInjectorController) context.getBean("setterInjectorController");
		String greetingSett = setterInjectorController.getGreeting();
		System.out.println(greetingSett);

		System.out.println("___Constructor");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context.getBean("constructorInjectorController");
		String greetingConst = constructorInjectorController.getGreeting();
		System.out.println(greetingConst);

	}

}
