package com.springBoot.leanrSpringBoot.courses.controller;

import com.springBoot.leanrSpringBoot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourceControler {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course("Janv--Cource" , 1500 , 1));
    }
}
