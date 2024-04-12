package com.pdev.springboot.firstWebApp.login;

import org.springframework.stereotype.Service;

@Service // we are using business logic so we use @Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUserName = username.equalsIgnoreCase("UserName123");
        boolean isValidUserPassword = password.equalsIgnoreCase("Dummy");
        return isValidUserName && isValidUserPassword;
    }
}
