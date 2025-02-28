package com.texas.miniprojectA.services;

import com.texas.miniprojectA.entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAll();

    Optional<Student> getById(Long id);
    void deleteStudent(Long id);

    Student updateStudent(Student student);
}
