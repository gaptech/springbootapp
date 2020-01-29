package com.gaptech.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {

    @GetMapping("/")
    public String getMessage(){
        return "Welcome to SpringBoot Docker Demo";
    }

    @GetMapping("/hellodocker")
    public String helloDocker(){
        return "Hello Docker";
    }
}
