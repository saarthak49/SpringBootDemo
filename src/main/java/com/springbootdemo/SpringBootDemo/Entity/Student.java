package com.springbootdemo.SpringBootDemo.Entity;


import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


/**
 * Student entity for persistence purposes in the db
 */
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
    //we know case-insensitive db

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Please enter a non-empty value for firstName")
    @Length(min = 3, max = 50)
    private String firstName;
    @NotBlank(message = "Please enter a non-empty value for lastName")
    @Length(min = 3, max = 50)
    private String lastName;
    private String address;
    private Long marks;


}


/*
Some other validations available are as follows:

Size
Email
Positive
Negative
PositiveOrZero
NegativeOrZero

In terms of dates:
Future
FutureOrPresent
Past
PastOrPresent
*/
