package com.texas.miniprojectA.services;

import com.texas.miniprojectA.controllers.DepartmentController;
import com.texas.miniprojectA.entity.Department;
import com.texas.miniprojectA.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }
    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);}
}
