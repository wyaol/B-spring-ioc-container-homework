package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

@RestController
public class GreetingController {

    private GreetingService greetingService;

    @Resource
    private WebApplicationContext context;

    @GetMapping("/greet")
    public String greet() {
        this.greetingService = (GreetingService) context.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

}
