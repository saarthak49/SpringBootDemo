package com.springbootdemo.SpringBootDemo.Service;


import com.springbootdemo.SpringBootDemo.Controller.StudentController;
import com.springbootdemo.SpringBootDemo.Entity.Student;
import com.springbootdemo.SpringBootDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        try {
            return studentRepository.save(student);
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e + " occured");
            return null;
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.get();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
