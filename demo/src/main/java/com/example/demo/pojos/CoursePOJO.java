package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class CoursePOJO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long courseId;

    private String courseName;
    private String medium;
    private Long courseDauration;


    public CoursePOJO(String courseName, String medium, Long courseDauration) {
        this.courseName = courseName;
        this.medium = medium;
        this.courseDauration = courseDauration;
    }

    

}
