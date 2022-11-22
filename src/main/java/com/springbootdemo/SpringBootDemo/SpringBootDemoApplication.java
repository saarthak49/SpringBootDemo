package com.springbootdemo.SpringBootDemo;

import com.springbootdemo.SpringBootDemo.GettingHang.FrontBencher;
import com.springbootdemo.SpringBootDemo.GettingHang.Student;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {



    @Autowired
    @Qualifier("FrontBencher")
    private static Student student;



    public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);

        student.study();

    }

}
