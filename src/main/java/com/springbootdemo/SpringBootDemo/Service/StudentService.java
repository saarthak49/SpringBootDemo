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

    /**
     * Get students based on name
     *
     * @param firstName the firstName of student you want to fetch
     * @return students having the firstName as firstname
     */
    List<Student> getStudent(final String firstName);


    void deleteStudent(final Long id);

    Student updateStudent(final Long id, final Student student);
}
