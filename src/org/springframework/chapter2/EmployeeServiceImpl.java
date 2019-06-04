package org.springframework.chapter2;

public class EmployeeServiceImpl implements EmployeeService{
  private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
