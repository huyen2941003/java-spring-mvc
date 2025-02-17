package com.example.laptop_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.laptop_shop.domain.User;
import com.example.laptop_shop.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String getHomePage(Model model) {
		String test = this.userService.handleHello();
		model.addAttribute("test", test);
		return "hello";
	}

	@RequestMapping("/admin/user/create")
	public String getUserPage(Model model) {
		model.addAttribute("newUser", new User());
		return "admin/user/create";
	}

	@RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
	public String createUserPage(Model model, @ModelAttribute("newUser") User createUser) {
		System.out.println("run here" + createUser);
		return "hello";
	}
}
