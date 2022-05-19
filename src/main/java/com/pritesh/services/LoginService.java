package com.pritesh.services;

import com.pritesh.dao.UserCredentials;
import com.pritesh.repositories.LoginRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    LoginRepositories loginRepositories;

    public boolean usernameAndPasswordValidate(String userName, String password) {
        Optional<UserCredentials> pass = loginRepositories.findById(userName);
        if (pass.isPresent()) {
            UserCredentials userCredentials = pass.get();
            return userCredentials.getPassword().equals(password);
        }
        else return false;


}}
