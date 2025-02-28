package com.texas.miniprojectA.controllers;


import com.texas.miniprojectA.entity.Department;
import com.texas.miniprojectA.services.DepartmentService;
import com.texas.miniprojectA.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Department>save(@RequestBody Department department){
    return new ResponseEntity<>(departmentService.saveDepartment(departmemnt), HttpStatus.CREATED);
}
