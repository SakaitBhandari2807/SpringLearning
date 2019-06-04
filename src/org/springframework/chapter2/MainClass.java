package org.springframework.chapter2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeServiceImpl employeeServiceImp = (EmployeeServiceImpl)context.getBean("employeeService");
        System.out.println(employeeServiceImp.getEmployeeDao().getName());



    }
}
