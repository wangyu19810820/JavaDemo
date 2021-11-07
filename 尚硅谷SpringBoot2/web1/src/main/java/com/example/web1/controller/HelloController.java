package com.example.web1.controller;

import com.example.web1.bean.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/car")
    public Car car() {
        Car car = new Car();
        car.setBrand("宝马");
        return car;
    }
}
