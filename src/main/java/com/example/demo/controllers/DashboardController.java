package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.services.BookService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

    private final UserService userService;
    private final BookService bookService;
    @Autowired
    public DashboardController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

//    @GetMapping("/dashboard")
//    public String dashboardPage(Model model, @RequestParam(name = "username", required = false) String username) {
//
//        User user = userService.getUserByUsername(username);
//        if (user != null) {
//            model.addAttribute("user", user);
//            return "dashboard";
//        } else {
//            // Обработка случая, когда пользователь не найден
//            return "redirect:/error";
//        }
//    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userService.getUserByUsername(username);
        model.addAttribute("user", user);
        return "dashboard";
    }

}