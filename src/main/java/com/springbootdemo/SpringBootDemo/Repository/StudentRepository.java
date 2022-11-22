package com.springbootdemo.SpringBootDemo.Repository;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Repository layer for performing the CRUD operations on Student entity
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    /**
     * to get the list of students based on firstName, ignore case
     *
     * @param firstName the name on which parameter to fetch
     * @return students matching criteria
     */
    List<Student> findByFirstNameIgnoreCase(final String firstName);
}
