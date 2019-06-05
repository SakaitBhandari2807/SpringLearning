package org.springframework.chapter5.BatchSpring.JdbcTemplate.Main;

import org.springframework.chapter5.BatchSpring.JdbcTemplate.Dao.EmployeeDao;
import org.springframework.chapter5.BatchSpring.JdbcTemplate.Model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class HrPayrollSystem {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);
//        employeeDao.createEmployee();
//        employeeDao.insertEmployee(new Employee(24,"Sachin Bansal",134));
//        employeeDao.insertEmployee(new Employee(25,"Sakait",1357927));
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(24,"Satoshi Nakamoto",1357926));
        employees.add(new Employee(24,"Vidisha Mittal",1357925));
        employees.add(new Employee(24,"Arjun Ar.",1357927));
        employees.add(new Employee(24,"Deepika Rautela",1357928));
        employeeDao.insertEmployees(employees);
        System.out.println("# of records : "+employeeDao.getEmployeeCount());
    }
}
