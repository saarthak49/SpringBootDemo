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
    List<Student> findByFirstNameIgnoreCase(final String firstName);   // NOTE - this could have been Student also, i.e
    // only a single student will be returned

    // use findByFirstName(final String firstName) if case-sensitive
    // check out other query methods also from the below doc https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
    // separate jpql queries can also be made
    // or sql queries can also be run using the native = true option


    // @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
    // User findByEmailAddress(String emailAddress);

}
