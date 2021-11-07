package com.example.helloworld.controller;

import com.example.helloworld.bean.Car;
import com.example.helloworld.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }

    @RequestMapping("/car")
    public Car car() {
        System.out.println(car.getBrand());
        return car;
    }

    @RequestMapping("/hello")
    public String handle01() {
        log.info("请求进来了。。。");
        return "你好 World!";
    }
}
