package com.sanjay.springboot.learnjpandjdbc.course.jdbc;

import com.sanjay.springboot.learnjpandjdbc.course.jpa.CourseJpaRepository;
import com.sanjay.springboot.learnjpandjdbc.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"learn AWS JPA","sanjay kumar")); //jpa - insert
        repository.save(new Course(1,"learn AWS JPA","sanjay kumar")); //springdatajpa - save
        repository.save(new Course(2,"learn Docker JPA","sanjay"));
        repository.save(new Course(3,"learn spring JPA","mani"));
        repository.deleteById((3L));
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(1L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("sanjay"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("learn AWS JPA"));

    }
}
