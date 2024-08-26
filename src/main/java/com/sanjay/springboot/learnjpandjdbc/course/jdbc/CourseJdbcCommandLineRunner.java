package com.sanjay.springboot.learnjpandjdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"learn AWS !","sanjay kumar"));
        repository.insert(new Course(2,"learn Docker !","sanjay"));
        repository.insert(new Course(3,"learn spring","mani"));
        repository.delete((3));
    }
}
