package com.springrest.coursesspringboot.services;

import com.springrest.coursesspringboot.entity.*;
import org.springframework.stereotype.*;

import java.util.*;


@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){

    list = new ArrayList<>();

    list.add(new Course(1,"Maths","Available"));
    list.add(new Course(2,"Java","Available"));



    }



    public List<Course> getCourses(){
        return list;
    }


    public Course getCourse(Long courseId){

        Course c= null;
        for(Course course:list){

            if(course.getId()==courseId){

                c = course;
                break;
            }

        }

        return c;

    }

     public Course addCourse(Course course){

     list.add(course);
     return course;

     }


}
