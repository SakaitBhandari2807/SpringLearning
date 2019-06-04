package org.springframework.chapter2.constructioninjection.simplejavatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStart {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = (Employee)context.getBean("employee");
        System.out.println(employee);
    }
}
