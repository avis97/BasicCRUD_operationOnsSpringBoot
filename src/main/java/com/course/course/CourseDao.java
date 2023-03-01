package com.course.course;


import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class CourseDao{
     HashMap<Integer,Course> Db=new HashMap<>();

     public void addCourse(Course course){
        Db.put(course.getCourseId(),course);
     }
    public Course getCourse(int id){
         return Db.get(id);
    }
    public List<Course> getAllCourse(){
         List<Course> ans=new ArrayList<>();
         for(Integer key:Db.keySet())
         {
             ans.add(Db.get(key));
         }
         return ans;
    }
    public void updateCourse(Course course, int id){
         for(Integer key:Db.keySet())
         {
             if(id==key)
             {
                 Db.put(key,course);
             }
         }
    }
    public void delete(int id){
         Db.remove(id);
    }
}
