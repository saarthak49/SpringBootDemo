package com.springbootdemo.SpringBootDemo.Controller;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import com.springbootdemo.SpringBootDemo.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * Controller layer for Student entity
 */
@RestController
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    /**
     * Get all  students from db
     *
     * @return list of all students from db
     */
    @GetMapping("/students")
    public List<Student> getStudents() {
        LOGGER.info("Inside controller get all students");
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
        LOGGER.info("Inside controller get student by id");
        return studentService.getStudent(id);
    }

    /**
     * get students with the firstName as firstName
     *
     * @param firstName the search criteria
     * @return list of students satisfying criteria
     */
    @GetMapping("/student/name/{firstName}")
    public List<Student> getStudent(@PathVariable("firstName") final String firstName) {
        LOGGER.info("Inside controller get all students by firstName");
        return studentService.getStudent(firstName);
    }


    /**
     * save student entity in db
     *
     * @param student the student request body to be persisted in the db
     * @return persisted object
     */
    @PostMapping("/student")
    public Student saveStudent(@Valid @RequestBody final Student student) {
        LOGGER.info("Inside controller save student");
        return studentService.saveStudent(student);
    }
    // NOTE: @Valid annotation added will validate the request body
    // against the validation provided in the entity


    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable final Long id, @RequestBody final Student student) {
        LOGGER.info("Inside controller update student");
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
        LOGGER.info("Inside controller delete student");
        studentService.deleteStudent(id);
        return "Successfully deleted";
    }


}
