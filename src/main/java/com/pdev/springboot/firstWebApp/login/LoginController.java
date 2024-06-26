package com.pdev.springboot.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name1")
public class LoginController {

    private AuthenticationService authenticationService;

    // We use constructor injection to tackle null pointer exception
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    // http://localhost:8080/login?name=xyz
    // Model -> use modelMap here and value can be used in jsp

    // GET
    @RequestMapping(value ="login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    //  POST=> it redirect the page after submit above page
    @RequestMapping(value ="login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, String password, ModelMap model) {

      if(authenticationService.authenticate(name, password)) {

          model.put("name1", name);
         // model.put("pass", password);

          //Authentication
          // lets take an example name-username
          //   password-dummy
          return "welcome";  // it is returning welcome.jsp page
      }
        // Authentication failed
        model.put("error", "Invalid username or password. Please try again.");
        return "login";
    }
}
