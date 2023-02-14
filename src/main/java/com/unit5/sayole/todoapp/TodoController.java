package com.unit5.sayole.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TodoController {

    @GetMapping
    public String hello(){
        return "To-do Application !";
    }
}
