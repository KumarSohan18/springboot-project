package com.devtiro.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "hello sohan kumar!";


    }
}
