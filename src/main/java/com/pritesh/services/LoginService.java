package com.pritesh.services;

import com.pritesh.POJO.UserCredentials;
import com.pritesh.repositories.LoginRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    LoginRepositories loginRepositories;

    public boolean usernameValidate(String userName){
        return loginRepositories.existsById(userName);
    }

    public boolean passwordValidate(String userName, String password){
        Optional<UserCredentials> pass = loginRepositories.findById(userName);
        String databasePassword = String.valueOf(pass.get());
        if ( databasePassword.equals(password)){
            return true;
        }
        else return false;
    }


}
