package com.example.helloworld.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "mycar")
@PropertySource(value="classpath:application.properties",encoding = "UTF-8")
@Data
@ToString
public class Car {

    private String brand;
    private int price;
}
