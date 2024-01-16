package com.ashutosh.springtodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("ashutosh");
        boolean isValidPassword = password.equalsIgnoreCase("1234");
        return isValidPassword && isValidUsername;
    }
}
