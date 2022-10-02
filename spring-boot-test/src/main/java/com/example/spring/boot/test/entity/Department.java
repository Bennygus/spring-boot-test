package com.example.spring.boot.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message = "Please add department Name")
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAdress='" + departmentAdress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public Department() {
    }

    public Department(long departmentId, String departmentName, String departmentAdress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAdress = departmentAdress;
        this.departmentCode = departmentCode;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdress() {
        return departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
