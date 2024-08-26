package com.sanjay.springboot.learnjpandjdbc.course.springdatajpa;

import com.sanjay.springboot.learnjpandjdbc.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    //custom query method
    List<Course> findByAuthor (String author);
    List<Course> findByName (String name);

}
