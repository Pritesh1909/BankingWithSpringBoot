package com.pritesh.controllers;

import com.pritesh.POJO.LoginPageCred;
import com.pritesh.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @Value("${app.name:userAuthentication}")
    private String returnVal;
    @RestController
    @RequestMapping(value="/" , method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE )
    private String validateCredentials(@RequestBody LoginPageCred loginPageCred){

        if( loginPageCred.getUserName() != null && loginPageCred.getPassWord() != null
                && !loginPageCred.getUserName().equals("") && !loginPageCred.getPassWord().equals("")
                && loginService.usernameAndPasswordValidate(loginPageCred.getUserName(), loginPageCred.getPassWord()))

            return returnVal;
        else return returnVal;
    }

    @RequestMapping("/login")
    public String loginpage(){
        return "index.html";
    }
    
}
