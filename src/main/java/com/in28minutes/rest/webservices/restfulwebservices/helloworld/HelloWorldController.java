package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
    //GET
    //URI - /hello-world
    //method - "hello world"

    @GetMapping(path = "/hello-world")

    public String helloWorld(){
        return "Hello World";
    }
    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        //throw new RuntimeException("Something went wrong");
       return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
