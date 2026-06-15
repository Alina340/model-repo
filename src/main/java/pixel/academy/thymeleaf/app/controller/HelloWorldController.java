package pixel.academy.thymeleaf.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //metoda pentru a afisa formularul HTML initial

    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //metoda care se ocupa de procesarea datelor din formularul HTML

    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
