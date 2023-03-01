package com.course.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class CourseController{

    @Autowired
     CourseService courses;    //this is object created by ioc..;;

    @PostMapping("/add_course")
    public String addCourse(@RequestBody Course course)
    {
          courses.addCourse(course);
          return "Course added done";
    }
    @GetMapping("/get_info")
    public Course getCourse(@RequestParam("id") int id)
    {
        return courses.getCourse(id);
    }
    @GetMapping("/get_info/all")
    public List<Course> getAllCourse()
    {
       List<Course> ans=courses.getAllCourse();
       return ans;
    }

    @PutMapping("/get_info/update/{id}")
    public String updateCourse(@RequestBody Course course,@PathVariable("id") int id)
    {
         courses.updateCourse(course,id);
         return "Update is saved";
    }
    @DeleteMapping("/get_info/delete/{id}")
    public String delete(@PathVariable("id") int id)
    {
         courses.delete(id);
         return "Delete the course";
    }
}
