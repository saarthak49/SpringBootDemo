package com.springbootdemo.SpringBootDemo.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    //in db the field names that you are
    //providing here change to snake case
    //camel case -> snake case
    //eg. firstName -> first_name
    //we know case insensitive db

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private Long marks;






}
