package com.deng.test;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public MyBean() {
        System.out.println("MyBean");
    }
}
