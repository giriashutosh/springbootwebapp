package com.ashutosh.springtodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    public String sayHello(){
        return "Jai shri ram";
    }

    @RequestMapping("say-hello-html")
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first HTML page with body");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
