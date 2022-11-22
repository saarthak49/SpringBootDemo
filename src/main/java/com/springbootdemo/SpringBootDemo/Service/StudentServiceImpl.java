package com.springbootdemo.SpringBootDemo.Service;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import com.springbootdemo.SpringBootDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


/**
 * Student service layer implementation
 */
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    /**
     * Save single student
     *
     * @param student student that you have to save
     * @return the saved student object
     */
    @Override
    public Student saveStudent(final Student student) {
        try {
            return studentRepository.save(student);
        } catch (final Exception e) {
            System.out.println("Exception : " + e + " occured");
            return null;
        }
    }


    /**
     * Get a list of all students in db
     *
     * @return list of all students in db
     */
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    /**
     * get student with id
     *
     * @param id the id of the student
     * @return the student details from db with the given id
     */
    @Override
    public Student getStudent(final Long id) {
        final Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.get();
    }

    /**
     * Get students based on name
     *
     * @param firstName the firstName of students you want to fetch
     * @return List of students having the firstName as firstname
     */
    @Override
    public List<Student> getStudent(final String firstName) {
        return studentRepository.findByFirstNameIgnoreCase(firstName);
    }


    /**
     * delete student with provided id
     *
     * @param id the id of the student to be deleted
     */
    @Override
    public void deleteStudent(final Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(final Long id, final Student student) {
        final Student s = studentRepository.findById(id).get();
        if (student.getFirstName() != null && !Objects.equals(student.getFirstName(), ""))
            s.setFirstName(student.getFirstName());
        if (student.getLastName() != null && !Objects.equals(student.getLastName(), ""))
            s.setLastName(student.getLastName());

        if (student.getAddress() != null && !Objects.equals(student.getAddress(), ""))
            s.setAddress(student.getAddress());

        if (student.getMarks() != null)
            s.setMarks(student.getMarks());
        studentRepository.save(s);
        return s;
    }
}
