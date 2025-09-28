package com.example.springlab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Spring quản lý Employee như 1 bean
public class Employee {
    private int id = 101;
    private String name = "Le Van C";

    @Autowired  // Tự động inject Address từ IoC container
    private Address address;

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', address=" + address + "}";
    }
}