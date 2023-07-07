package com.example.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    /*
     * @GetMapping("/")
     * public String getMethodName(){
     * return "Hello!";
     * }
     */

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello/{name}")
    public String getClient(@PathVariable("name") String name) {
        return String.format("Hello %s!", name);
    }
}
