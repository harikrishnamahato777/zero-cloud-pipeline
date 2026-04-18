package com.devops.zero_cloud_pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Zero-Cloud CI/CD Pipeline is Running!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}