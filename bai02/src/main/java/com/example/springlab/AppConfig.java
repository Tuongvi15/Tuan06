package com.example.springlab;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration              // Đánh dấu là class config
@ComponentScan("com.example.springlab")  // Quét package để tìm @Component
public class AppConfig { }