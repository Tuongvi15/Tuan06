package com.example.springlab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotationApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = ctx.getBean(Employee.class);
        System.out.println("Annotation Injection -> " + emp);

        ctx.close();
    }
}