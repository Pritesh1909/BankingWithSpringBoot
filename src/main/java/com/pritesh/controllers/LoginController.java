package com.pritesh.controllers;

import com.pritesh.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(value="/login")
    private boolean validateCredentials(@RequestParam String userName, @RequestParam String password){

        if( userName != null && password != null
                && !userName.equals("") && !password.equals("")
                && loginService.passwordValidate(userName, password)
                && loginService.usernameValidate(userName))

            return true;
        else return false;
    }
    
}
