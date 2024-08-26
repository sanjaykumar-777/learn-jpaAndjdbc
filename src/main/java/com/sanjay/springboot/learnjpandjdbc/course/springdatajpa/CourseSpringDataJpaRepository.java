package com.sanjay.springboot.learnjpandjdbc.course.springdatajpa;

import com.sanjay.springboot.learnjpandjdbc.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

}
