package com.example.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.domain.User;
import com.example.mvc.repository.UserRepository;
import com.example.mvc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePageString(Model model) {
        List<User> getListUser = this.userService.getAllUsersByEmail("huyenruoi2904@gmail.com");
        System.out.println(getListUser);
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserListPage(Model model) {
        List<User> listUsers = this.userService.getAllUser();
        model.addAttribute("users", listUsers);
        return "admin/user/list";
    }

    @RequestMapping("/admin/user/create")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User createUser) {
        this.userService.handleSaveUser(createUser);
        return "redirect:/admin/user";
    }

    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("id", id);
        return "admin/user/detail";
    }

    @RequestMapping("/admin/user/update/{id}")
    public String getUserUpdatePage(Model model, @PathVariable long id) {
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "admin/user/update";
    }

    @PostMapping("/admin/user/update")
    public String postUserUpdatePage(Model model, @ModelAttribute("updateUser") User updateUser) {
        User user = this.userService.getUserById(updateUser.getId());
        if (user != null) {
            user.setAddress(updateUser.getAddress());
            user.setFullName(updateUser.getFullName());
            user.setPhone(updateUser.getPhone());

            this.userService.handleSaveUser(user);
        }
        return "redirect:/admin/user";
    }

    @GetMapping("/admin/user/delete/{id}")
    public String getUserDeletePage(Model model, @PathVariable long id) {
        User user = this.userService.getUserById(id);
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "admin/user/delete";
    }

    @PostMapping("/admin/user/delete")
    public String postUserDeletePage(@RequestParam("id") long id) {
        this.userService.deleteById(id);
        return "redirect:/admin/user";
    }

}
