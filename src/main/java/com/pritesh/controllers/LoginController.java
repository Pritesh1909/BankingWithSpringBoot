package com.pritesh.controllers;

import com.pritesh.POJO.LoginPageCred;
import com.pritesh.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value="/login" )
    private boolean validateCredentials(@RequestBody LoginPageCred loginPageCred){

        if( loginPageCred.getUserName() != null && loginPageCred.getPassWord() != null
                && !loginPageCred.getUserName().equals("") && !loginPageCred.getPassWord().equals("")
                && loginService.usernameAndPasswordValidate(loginPageCred.getUserName(), loginPageCred.getPassWord()))


            return true;
        else return false;
    }
    
}
