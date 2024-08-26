package com.sanjay.springboot.learnjpandjdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    //insert query
    private static String INSERT_QUERY =
            """
            insert into Courses (id,name,author)
            Values(?,?,?);       
            """;

    //delete query
    private static String DELETE_QUERY =
            """
            delete from Courses where id = ?;
            
            """;

    private static String SELECT_QUERY =
            """
            select * from Courses where id = ?;
            
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course getById(long id){
        //ResultSet - Bean -> RowMapper
        //used to map the table columns back to java bean (Course)
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }
}
