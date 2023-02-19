package com.springrest.coursesspringboot.services;

import com.springrest.coursesspringboot.entity.*;

import java.util.*;

public interface CourseService  {

    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);

}
