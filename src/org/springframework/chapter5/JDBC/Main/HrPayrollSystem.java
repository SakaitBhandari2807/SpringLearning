package org.springframework.chapter5.JDBC.Main;

import org.springframework.chapter5.JDBC.Dao.EmployeeDao;
import org.springframework.chapter5.JDBC.Model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrPayrollSystem {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);
        employeeDao.createEmployee();
        employeeDao.insertEmployee(new Employee("Sachin Bansal",133));
        employeeDao.insertEmployee(new Employee("Sakait",1357927));

        Employee e = employeeDao.getEmployeeById(1357927);

        System.out.println("Employee Name : "+e.getName());

    }
}
