package com.texas.miniprojectA.repository;

//CourseRepository

import com.texas.miniprojectA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}