package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public String findPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return null;
    }

    public Employee findEmployeeByEmpId(int empId) {
        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                return employee;
            }
        }
        return null;
    }
}

class Employee {
    private int empId;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee(int empId, String phoneNumber, String name, int experience) {
        this.empId = empId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmpId() {
        return empId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}