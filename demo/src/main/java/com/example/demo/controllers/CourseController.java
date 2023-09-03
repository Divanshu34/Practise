package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.CoursePOJO;
import com.example.demo.services.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add-course/{courseName}/{medium}/{courseDuration}")
    public String addCourse(@PathVariable String courseName, @PathVariable String medium, @PathVariable Long courseDuration){

        courseService.addCourse(courseName, medium, courseDuration);
        return "success";
    }

    @GetMapping("/get-course/{courseId}")
    public CoursePOJO getCourse(Long courseId){
        return courseService.getCourse(courseId);
    }
}
