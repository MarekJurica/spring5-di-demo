package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    
    private GreetingService greetingService;
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
    
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
        
    }
}
