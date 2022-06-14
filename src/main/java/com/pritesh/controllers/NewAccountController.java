package com.pritesh.controllers;

import com.pritesh.POJO.UserDetailsForNewAccount;
import com.pritesh.model.AccountDao;
import com.pritesh.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAccountController {

    @Autowired
    AccountService accountService;

    @PutMapping("/new")
    private boolean newAccountCreation(@RequestBody AccountDao accountDao){

        accountService.accountCreation(accountDao);


        return false;
    }

}
