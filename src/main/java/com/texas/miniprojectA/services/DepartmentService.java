package com.texas.miniprojectA.services;



import com.texas.miniprojectA.entity.Department;

import java.util.List;
import java.util.Optional;
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> listAllDepartment();

    Optional<Department> getDepartmentById(Long id);

    void  deleteDepartment(Long id);

    Department updateDepartment(Department department);
}

