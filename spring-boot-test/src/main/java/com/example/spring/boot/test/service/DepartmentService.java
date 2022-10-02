package com.example.spring.boot.test.service;

import com.example.spring.boot.test.entity.Department;

import java.util.List;


public interface DepartmentService {


 

    public Department savedDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
