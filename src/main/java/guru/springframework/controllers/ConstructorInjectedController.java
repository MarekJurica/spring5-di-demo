package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorInjectedController {
    
    private GreetingService greetingService;
    
    String sayHello() {
        return greetingService.sayGreeting();
    }
    
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
        
    }
}
