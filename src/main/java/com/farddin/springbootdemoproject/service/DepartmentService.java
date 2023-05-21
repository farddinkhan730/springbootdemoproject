package com.farddin.springbootdemoproject.service;

import com.farddin.springbootdemoproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
