package com.texas.miniprojectA.services;

import com.texas.miniprojectA.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.texas.miniprojectA.entity.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student createStudent(Student student){

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getById(Long id){
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.saveAndFlush(student);
    }


}
