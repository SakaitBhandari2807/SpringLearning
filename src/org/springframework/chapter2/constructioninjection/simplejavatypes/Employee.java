package org.springframework.chapter2.constructioninjection.simplejavatypes;

public class Employee {
    private String employeeName;
    private int employeeAge;
    private boolean married;

    public Employee(String employeeName, int employeeAge, boolean married) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Employee Name: "+employeeName+", EmployeeAge:"+employeeAge+", IsMarried:"+married;
    }
}
