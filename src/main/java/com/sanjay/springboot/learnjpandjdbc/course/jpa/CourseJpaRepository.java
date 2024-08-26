package com.sanjay.springboot.learnjpandjdbc.course.jpa;

import com.sanjay.springboot.learnjpandjdbc.course.jdbc.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
/*while using jpa Transactional
annotation should be used
*/
@Transactional
public class CourseJpaRepository {

    //Autowired can also be used,
    //but better approach is this
    /*
    Autowired - used for injecting any Spring bean.
    persistenceContext - specifically used for injecting EntityManager in JPA
     */
    @PersistenceContext
    private EntityManager entityManager;

    //insert query
    public void insert(Course course){
        entityManager.merge(course);
    }

    //select query
    public Course getById(long id){
        return entityManager.find(Course.class,id);
    }

    //delete query
    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
