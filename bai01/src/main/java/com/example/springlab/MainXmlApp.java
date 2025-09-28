package com.example.springlab;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp1 = ctx.getBean("employeeSetter", Employee.class);
        System.out.println("Setter Injection -> " + emp1);

        Employee emp2 = ctx.getBean("employeeConstructor", Employee.class);
        System.out.println("Constructor Injection -> " + emp2);
    }
}