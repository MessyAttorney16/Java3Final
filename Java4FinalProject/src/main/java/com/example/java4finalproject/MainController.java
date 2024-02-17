package com.example.java4finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")
public class MainController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private QuizRepository testRepository;

    @GetMapping("/")
    public String showLogin(User user){return "login";}




}
