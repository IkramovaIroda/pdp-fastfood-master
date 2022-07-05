package com.example.couriermobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourierMobileApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourierMobileApplication.class, args);
    }

}
