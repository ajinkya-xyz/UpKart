package xyz.ajinkya.UpKart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller + @ResponseBody
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "Welcome to the session!";
    }
}
