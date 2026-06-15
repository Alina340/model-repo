package pixel.academy.thymeleaf.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    //aici vom crea mapping-ul pentru "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "helloworld";

        //la return cauta helloworld.html
        //spune aplicatiei sa caute un sablon helloworld
    }

    @GetMapping("/greetingNewForm")
    public String generateGreeting(@RequestParam("studentName") String theName, Model model) {

        //transform the input to uppercase
        theName = theName.toUpperCase();

        //build the response message
        String result = "Submission successful. User: " + theName;

        //add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
