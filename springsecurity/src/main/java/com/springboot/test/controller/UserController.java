package com.springboot.test.controller;

import com.springboot.test.dtos.Userdto;
import com.springboot.test.models.User;
import com.springboot.test.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        userRepository = userRepository;
    }

    @PostMapping("/Submit")
    public String submitUser(@ModelAttribute("user") Userdto user, Model model)
    {
        User u= new User();
        u.setUsername(user.getDtousername());
        u.setEmail(user.getDtoemail());
        u.setPassword(user.getDtopassword());
        model.addAttribute("user",u);
        u=userRepository.save(u);
       return "home";
    }

}
