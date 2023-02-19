package com.springrest.coursesspringboot.controller;

import com.springrest.coursesspringboot.entity.*;
import com.springrest.coursesspringboot.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MyController {


    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){

        return "Welcome to Courses Application";

    }

    @GetMapping("/courses")
    public List<Course> getCourses() {

      return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
       return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return this.courseService.addCourse(course);

    }








}
