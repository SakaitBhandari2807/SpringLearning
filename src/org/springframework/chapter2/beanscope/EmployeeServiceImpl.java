package org.springframework.chapter2.beanscope;

public class EmployeeServiceImpl implements EmployeeService{

    private String message;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message=message;
    }
}
