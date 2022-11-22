package com.springbootdemo.SpringBootDemo.Service;

import com.springbootdemo.SpringBootDemo.Entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudent(Long id);

    void deleteStudent(Long id);
}
