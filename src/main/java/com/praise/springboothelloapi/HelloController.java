package com.praise.springboothelloapi;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
        return "Hello Praise, welcome to Spring Boot!";
    }

    @GetMapping("/about")
    public String about() {
        return "I am learning Spring Boot and becoming a Software Engineer.";
    }


    @GetMapping("/hello/{name}")
    public String name(@PathVariable String name) {
        return "Hello " + name + ", " + " " + "welcome to Spring Boot and becoming a Software.";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hello " +  name + "," + " " + "nice to meet you!";
    }



}









