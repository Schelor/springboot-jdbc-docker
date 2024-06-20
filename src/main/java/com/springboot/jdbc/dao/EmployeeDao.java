package com.springboot.jdbc.dao;

import com.springboot.jdbc.model.Employee;

import java.util.List;

/**
 * @author Xie.Le
 * @since 2024/6/19
 */
public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
