package org.springframework.chapter5.BatchSpring.JdbcTemplate.Dao;

import org.springframework.chapter5.BatchSpring.JdbcTemplate.Model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee getEmployeeById(int id);
    void createEmployee();
    void insertEmployees(List<Employee> employees);
    void deleteEmployeeById(int id);
    int getEmployeeCount();
}
