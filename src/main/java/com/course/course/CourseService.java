package com.course.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CourseService{

    @Autowired
    CourseDao courses;
    public void addCourse(Course course){
        courses.addCourse(course);
    }
    public Course getCourse(int id){
        return courses.getCourse(id);
    }
    public List<Course> getAllCourse(){
        return courses.getAllCourse();
    }
    public void updateCourse(Course course, int id){

        courses.updateCourse(course,id);
    }
    public void delete(int id){
        courses.delete(id);
    }

}
