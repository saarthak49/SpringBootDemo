package com.springbootdemo.SpringBootDemo.Controller;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import com.springbootdemo.SpringBootDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Controller layer for Student entity
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    /**
     * Get all  students from db
     *
     * @return list of all students from db
     */
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }


    /**
     * Get student with given id from db
     *
     * @param id the id of the student to be found
     * @return student with the given id
     */
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") final Long id) {
        return studentService.getStudent(id);
    }


    /**
     * save student entity in db
     *
     * @param student the student request body to be persisted in the db
     * @return persisted object
     */
    @PostMapping("/student")
    public Student saveStudent(@RequestBody final Student student) {
        return studentService.saveStudent(student);
    }


    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable final Long id, @RequestBody final Student student) {
        return studentService.updateStudent(id, student);
    }


    /**
     * delete the student record from db
     *
     * @param id the id of the student record to be deleted from db
     * @return the deletion status
     */
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") final Long id) {
        studentService.deleteStudent(id);
        return "Successfully deleted";
    }


}
