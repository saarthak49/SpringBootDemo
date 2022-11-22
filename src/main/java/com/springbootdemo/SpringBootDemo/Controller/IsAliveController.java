package com.springbootdemo.SpringBootDemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsAliveController {

    @GetMapping("/")
    public String isAlive()
    {
        return "Application is alive and kicking !!";
    }


    @GetMapping("/isAlive")
    public String isAliveMapping()
    {
        return "Application is alive and kicking !!";
    }

}
