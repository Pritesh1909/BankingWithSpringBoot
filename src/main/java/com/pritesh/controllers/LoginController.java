package com.pritesh.controllers;

import com.pritesh.services.LoginService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value="/login" , ContentType = APPLICATION)
    private boolean validateCredentials(@RequestParam String userName, @RequestParam String password){

        if( userName != null && password != null
                && !userName.equals("") && !password.equals("")
                && loginService.usernameAndPasswordValidate(userName, password))


            return true;
        else return false;
    }
    
}
