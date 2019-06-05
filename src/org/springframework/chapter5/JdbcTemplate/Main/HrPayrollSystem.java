package org.springframework.chapter5.JdbcTemplate.Main;

import org.springframework.chapter5.JdbcTemplate.Dao.EmployeeDao;
import org.springframework.chapter5.JdbcTemplate.Model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrPayrollSystem {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);
//        employeeDao.createEmployee();
//        employeeDao.insertEmployee(new Employee(24,"Sachin Bansal",134));
//        employeeDao.insertEmployee(new Employee(25,"Sakait",1357927));

        Employee e = employeeDao.getEmployeeById(1357927);

        System.out.println("Employee Name : "+e.getName());
    }
}
