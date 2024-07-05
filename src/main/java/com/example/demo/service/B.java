package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private final C c;

    @Autowired
    public B(C c) {
        this.c = c;
    }

    public void doSomething() {
        System.out.println("Class B is doing something");
        c.doSomething();
    }
}

