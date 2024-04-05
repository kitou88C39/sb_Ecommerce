package com.example.admin.controller;

import com.example.library.dto.AdminDto;
import com.example.library.service.imple.AdminServiceImpl;
import jakarta.validation.Valid;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

@GetMapping("/login")
public String loginForm(){
    return "login";
}

@GetMapping("/register")
public String register(Model model) {
    model.addAllAttributes("adminDto", new AdminDto());
    return "register";
}

@GetMapping("/forgot-password")
public String forgotPassword(Model model) {
    return "forgot-password";
}

@PostMapping("/register-new")
public String addNewAdmin(@Valid @ModelAttribute("adminDto")AdminDto adminDto,
                          BindingResult result,
                          Model model){

    try{
        if(result.hasErrors()){
            model.addAttribute("adminDto", adminDto);
            result.toString();
            return "reqister";
        }
        String username = adminDto.getUsername();
        Admin admin = adminService.findByUsername(username);
        if(admin != null){
            model.addAttribute("adminDto", adminDto);
            System.out.println("admin not null");
            model.addAttribute("emailError","Your email has been registered!")
            return "register";
        }
        if(adminDto = getPassword().equals(adminDto.getRepeatPassword())) {
            adminDto.setPassword(passwordEncoder.encode(adminDto.getPassword()));
            adminService.save(adminDto);
            System.out.println("success");
            model.addAttribute("adminDto", adminDto);
        }else{
            model.addAttribute("adminDto", adminDto);
            System.out.println("password not same");
            return "register";
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return "reqister";
}