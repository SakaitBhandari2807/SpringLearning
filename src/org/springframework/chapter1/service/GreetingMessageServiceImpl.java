package org.springframework.chapter1.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService{
    @Override
    public String greetUser() {
        return "Welcome to chapter-1 of Spring Application Development";
    }
}
