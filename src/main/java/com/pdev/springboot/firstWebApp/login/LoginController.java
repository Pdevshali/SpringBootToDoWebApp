package com.pdev.springboot.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=xyz
    // Model -> use modelMap here and value can be used in jsp
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name1", name);
        System.out.println("Request param is "+ name); // Not recommended for production
        return "login";
    }
}
