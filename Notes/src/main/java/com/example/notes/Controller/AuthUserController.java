package com.example.notes.Controller;

import com.example.notes.Model.User;
import com.example.notes.Service.UserService;
import com.example.notes.util.UserValidation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthUserController {
    private UserService userService;
    private UserValidation userValidation;

    @GetMapping("/sign_up")
    public String getSignUp(Model model){
        model.addAttribute("user", new User());
        return "auth/sign_up";
    }

//    @PostMapping("/sign_up")
//    public String signUp(@ModelAttribute @Valid User user){
//        userValidation.validate(user);
//    }

}
