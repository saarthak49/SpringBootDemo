package com.springbootdemo.SpringBootDemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Is Alive Controller
 */
@RestController
public class IsAliveController {

    /**
     * Default mapping
     *
     * @return String
     */
    @GetMapping("/")
    public String isAlive() {
        return "Application is alive and kicking !!";
    }


    /**
     * IsAlive mapping
     *
     * @return String
     */
    @GetMapping("/isAlive")
    public String isAliveMapping() {
        return "Application is alive and kicking !!";
    }

}
