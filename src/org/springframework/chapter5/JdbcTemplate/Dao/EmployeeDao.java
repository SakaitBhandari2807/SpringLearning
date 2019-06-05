package org.springframework.chapter5.JdbcTemplate.Dao;

import org.springframework.chapter5.JdbcTemplate.Model.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(int id);
    void createEmployee();
    int insertEmployee(Employee employee);
    void deleteEmployeeById(int id);
    int getEmployeeCount();
}
