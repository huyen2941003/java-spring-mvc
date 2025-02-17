package com.example.laptop_shop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

	@RequestMapping("/")
	public String handleHello() {
		return "Hello getHomePage user";
	}
}