package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private final B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }

    public void doSomething() {
        System.out.println("Class A is doing something");
        b.doSomething();
    }
}


