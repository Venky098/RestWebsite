package com.venkat.restapp.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HomeApplication {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot REST App is running!";
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of("status", "running", "version", "1.0");
    }
}
