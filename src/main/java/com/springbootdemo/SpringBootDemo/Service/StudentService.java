package com.springbootdemo.SpringBootDemo.Service;

import com.springbootdemo.SpringBootDemo.Entity.Student;

import java.util.List;


/**
 * Student service layer interface
 */
public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudent(final Long id);

    void deleteStudent(final Long id);

    Student updateStudent(final Long id, final Student student);
}
