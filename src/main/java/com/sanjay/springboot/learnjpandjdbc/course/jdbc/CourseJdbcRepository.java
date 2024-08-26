package com.sanjay.springboot.learnjpandjdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into Courses (id,name,author)
            Values(1,'learn AWS','Sanjay');       
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
