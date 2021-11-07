package com.example.helloworld2.controller;

import com.example.helloworld2.bean.Car;
import com.example.helloworld2.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
        System.out.println(person.getUserName());
        return person;
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01() {
        log.info("请求进来了。。。");
        return "你好 World!";
    }
}
