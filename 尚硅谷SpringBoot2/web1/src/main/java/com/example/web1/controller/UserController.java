package com.example.web1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String get() {
        return "get";
    }

    @PostMapping
    public String post() {
        return "post";
    }

    @DeleteMapping
    public String delete() {
        return "delete";
    }

    @PutMapping
    public String put() {
        return "put";
    }
}
