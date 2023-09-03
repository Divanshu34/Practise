package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.CoursePOJO;
import java.util.List;


public interface ICourseDAO extends JpaRepository<CoursePOJO, Long>{
    List<CoursePOJO> findByCourseName(String courseName);
}
