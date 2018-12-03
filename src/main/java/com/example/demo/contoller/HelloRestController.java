package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/")
    public User index() {
        User defaultUser = new User("World");
        return defaultUser;
    }

    @GetMapping("/hello")
    public User hello(@RequestParam(value="name", required=false, defaultValue="World") String myName) {
        User user = new User(myName);
        return user;
    }
}
