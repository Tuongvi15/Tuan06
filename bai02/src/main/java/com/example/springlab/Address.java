package com.example.springlab;
import org.springframework.stereotype.Component;

@Component  // Spring sẽ tự quản lý bean này
public class Address {
    private String city = "Da Nang";
    private String state = "Central";
    private String country = "Vietnam";

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}