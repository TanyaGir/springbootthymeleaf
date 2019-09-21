package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        // return to templates/demo.html page.
        return "demo";
    }
}
