package org.springframework.chapter5.JdbcTemplate.Model;

public class Employee {
    private int Age;
    private String name;
    private int EmpId;

    public Employee(int age, String name, int empId) {
        Age = age;
        this.name = name;
        EmpId = empId;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return EmpId;
    }
}
