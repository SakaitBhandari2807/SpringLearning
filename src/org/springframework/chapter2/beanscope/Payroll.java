package org.springframework.chapter2.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Payroll {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl) context.getBean("employeeServiceBean");

        System.out.println(employeeServiceImpl.hashCode());


        EmployeeServiceImpl emp2 = (EmployeeServiceImpl) context.getBean("employeeServiceBean");

        System.out.println(emp2.hashCode());

    }
}
