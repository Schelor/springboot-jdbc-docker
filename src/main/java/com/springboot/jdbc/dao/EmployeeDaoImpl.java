package com.springboot.jdbc.dao;

import com.springboot.jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Xie.Le
 * @since 2024/6/19
 */
@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        List<Employee> result = new ArrayList<Employee>();
        for (Map<String, Object> row : rows) {
            Employee emp = new Employee();
            emp.setEmpId((String) row.get("empId"));
            emp.setEmpName((String) row.get("empName"));
            result.add(emp);
        }

        return result;
    }

    @Override
    public void insertEmployee(Employee employee) {
        String sql = "INSERT INTO employee " + "(empId, empName) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[]{employee.getEmpId(), employee.getEmpName()});

    }

}
