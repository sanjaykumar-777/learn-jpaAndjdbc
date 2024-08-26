package com.sanjay.springboot.learnjpandjdbc.course.jdbc;

import com.sanjay.springboot.learnjpandjdbc.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"learn AWS JPA","sanjay kumar"));
        repository.insert(new Course(2,"learn Docker JPA","sanjay"));
        repository.insert(new Course(3,"learn spring JPA","mani"));
        repository.deleteById((3));
        System.out.println(repository.getById(2));
        System.out.println(repository.getById(1));
    }
}
