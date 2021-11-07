package com.example.helloworld2.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mycar")
@Data
@ToString
public class Car {

    private String brand;
    private int price;
}
