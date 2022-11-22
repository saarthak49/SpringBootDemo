package com.springbootdemo.SpringBootDemo.Controller;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import com.springbootdemo.SpringBootDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getAllStudents();
    }


    // get single student

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") Long id)
    {
        return studentService.getStudent(id);
    }


    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }


    // update a student


    // delete a particular student
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") Long id)
    {
        studentService.deleteStudent(id);
        return "Successfully deleted";
    }



}
