package com.example.spring.boot.test.service;

import com.example.spring.boot.test.entity.Department;
import com.example.spring.boot.test.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
      Department depDB = departmentRepository.findById(departmentId).get();

      if (Objects.nonNull(department.getDepartmentName())&&
      !"".equalsIgnoreCase(department.getDepartmentName())) {
          depDB.setDepartmentName(department.getDepartmentName());
      }
        if (Objects.nonNull(department.getDepartmentCode())&&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        if (Objects.nonNull(department.getDepartmentAdress())&&
                !"".equalsIgnoreCase(department.getDepartmentAdress())) {
            depDB.setDepartmentAdress(department.getDepartmentAdress());
        }
        return departmentRepository.save(depDB);

    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

    @Override
    public Department savedDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }
}
