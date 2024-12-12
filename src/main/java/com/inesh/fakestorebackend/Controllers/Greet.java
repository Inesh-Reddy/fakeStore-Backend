package com.inesh.fakestorebackend.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

    @RequestMapping(value = "/fakeStore", method = RequestMethod.GET)
    public String greet(String name){
        return "Hello, Welcome to Fake Store Backend! ";
    }

    @RequestMapping( value = "/fakeStore/{name}", method = RequestMethod.GET)
    public String greetWithName(@PathVariable String name){
        return "Hello "+name+". Welcome to Fake Store Backend!";
    }
}
