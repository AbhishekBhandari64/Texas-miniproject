package com.texas.miniprojectA.services;

//CourseService
//CourseService


import com.texas.miniprojectA.entity.Course;
import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);

    Course update(Course courseDetails);
}
