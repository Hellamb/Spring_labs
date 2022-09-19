package com.kpispring.lab1.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class First implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("First");
    }
}
