package com.tech.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class HelloController {
    public String sayHelloMessage(){
        return "Hello Service";
    }
}
