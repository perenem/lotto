package com.example.myProject.controller;

import com.example.myProject.repository.UserRepository;
import com.example.myProject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
//    private final UserService userService;
    UserRepository userRepository;

    @GetMapping("/")
    public String main(){
        return "/main";
    }
}
