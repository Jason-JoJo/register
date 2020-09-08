package com.controller;

import com.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    @GetMapping("/register")
    String register(Model model){
        System.out.println("in register");
        model.addAttribute("userForm",new UserForm());
        return "register";
    }

    @GetMapping("/")
    String index(){
        return "register";
    }

    @PostMapping("/register")
    String doRegister(@Valid UserForm userForm, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrorList=bindingResult.getFieldErrors();
            fieldErrorList.forEach(err1 -> System.out.println(err1.getField()+" : "+ err1.getDefaultMessage()));

            return "register";
        }
        return "welcome";
    }
}
