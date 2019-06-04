package org.springframework.chapter5.JDBC.Main;

import org.springframework.chapter5.JDBC.Dao.EmployeeDaoImpl;
import org.springframework.chapter5.JDBC.Model.Employee;

public class HrPayrollSystem {
    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
//        employeeDao.createEmployee();
        employeeDao.insertEmployee(new Employee("Sachin Bansal",133));
        employeeDao.insertEmployee(new Employee("Sakait",1357927));

        Employee e = employeeDao.getEmployeeById(1357927);

        System.out.println(e.getId()+e.getName());
    }
}
