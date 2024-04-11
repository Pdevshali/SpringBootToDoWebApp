package com.pdev.springboot.firstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // "say-hello" => "Hello ! What are you doing today?"

    @RequestMapping("say-hello") // if wee hit this url it will return following thing
    @ResponseBody
    public String sayHello(){
        return "Hello ! What are you doing today?";

        // create jsp- java server pages for   html
        // sayHello.jsp
    }

    // src/main/resources/META-INS/resources/WEB-INF/jsp/sayhello.jsp
    // src/main/resources/META-INS/resources/WEB-INF/jsp/welcome.jsp
    // src/main/resources/META-INS/resources/WEB-INF/jsp/login.jsp
    // src/main/resources/META-INS/resources/WEB-INF/jsp/todos.jsp
    @RequestMapping("say-hello-jsp") // if wee hit this url it will return following thing
    public String sayHelloJsp(){
        return "sayHello";
        // create jsp- java server pages for   html
        // sayHello.jsp
    }
}
