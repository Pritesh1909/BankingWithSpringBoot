package com.pritesh.services;

import com.pritesh.model.AccountDao;
import com.pritesh.repositories.AccountRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepositories accountRepositories;

    public void accountCreation(AccountDao accountDao){
        accountRepositories.save(accountDao);
    }


}
