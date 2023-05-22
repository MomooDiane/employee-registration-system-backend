package com.momodiane.employeesystemapi.services;

import com.momodiane.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
     Employee createEmployee(Employee employee);

     List<Employee> getAllEmployees();

     boolean deleteEmployee(Long id);
}
