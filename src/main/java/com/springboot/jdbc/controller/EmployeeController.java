package com.springboot.jdbc.controller;

import com.springboot.jdbc.dao.EmployeeDao;
import com.springboot.jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xie.Le
 * @since 2024/6/19
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {

        return employeeDao.getAllEmployees();

    }

    @RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
    public void insertEmployee(@RequestBody Employee employee) {
        employeeDao.insertEmployee(employee);
    }
}
