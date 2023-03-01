package com.course.course;

public class Course{

      public int courseId;
      public String courseName;
      public int coursePrice;

    public Course(int courseId, String courseName, int coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
