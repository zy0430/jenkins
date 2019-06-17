package com.example.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(){
        return "this 4" + new Date();
    }
}
