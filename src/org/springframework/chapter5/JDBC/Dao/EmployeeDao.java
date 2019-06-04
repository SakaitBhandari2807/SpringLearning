package org.springframework.chapter5.JDBC.Dao;

import org.springframework.chapter5.JDBC.Model.Employee;

public interface EmployeeDao {
    void createEmployee();
    Employee getEmployeeById(int id);
    void insertEmployee(Employee employee);
}
