package com.example.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.domain.User;
import com.example.mvc.repository.UserRepository;
import com.example.mvc.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePageString(Model model) {
        List<User> getListUser = this.userService.geTAllUsersbyEmail("huyenruoi2904@gmail.com");
        System.out.println(getListUser);
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserListPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/list";
    }

    @RequestMapping("/admin/user/create")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/done-create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User createUser) {
        this.userService.handleSaveUser(createUser);
        return "hello";
    }

}
