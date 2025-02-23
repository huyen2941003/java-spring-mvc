package com.example.mvc.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mvc.domain.User;
import com.example.mvc.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String handleHello() {
        return "Hello getHomePage user";
    }

    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }
}