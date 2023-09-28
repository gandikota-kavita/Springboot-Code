package com.Awscloudspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestControllerspringboot {
    @GetMapping()
    public String fetchHelloWorld() {
        return "Hello Springboot Application is deployed";
    }



}
