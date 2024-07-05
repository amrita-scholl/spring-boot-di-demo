package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    private final D d;

    @Autowired
    public C(D d) {
        this.d = d;
    }

    public void doSomething() {
        System.out.println("Class C is doing something");
        d.doSomething();
    }
}
