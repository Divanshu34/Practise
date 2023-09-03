package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ICourseDAO;
import com.example.demo.pojos.CoursePOJO;

@Service
@Transactional
public class CourseService {

    @Autowired
    private ICourseDAO courseDAO;

    public String addCourse(String name, String medium, Long courseDuration) {
        CoursePOJO coursePOJO = new CoursePOJO(name, medium, courseDuration);
        courseDAO.save(coursePOJO);
        return "success";
    }

    public CoursePOJO getCourse(Long courseId){
        // courseDAO.findByCourseName(null)
        return courseDAO.findById(courseId).get();
        // CoursePOJO coursePOJO = new CoursePOJO();
        // coursePOJO = op.get();
        // return coursePOJO;
    }
}
