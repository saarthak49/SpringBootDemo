package com.springbootdemo.SpringBootDemo.Repository;


import com.springbootdemo.SpringBootDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository layer for performing the CRUD operations on Student entity
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
