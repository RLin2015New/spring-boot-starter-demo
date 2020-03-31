package com.example;

import com.lifl.testautoconfiguration.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    HelloService helloService;
    
    @GetMapping("/get")
    public String print(){
        return helloService.sayHello();
//        return null;
    }
}
