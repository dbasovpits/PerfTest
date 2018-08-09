package pits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String welcome(Model model) {
        return "index";
    }

    @RequestMapping("/auth")
    public String auth(Model model) {
        return "auth";

    }

    @RequestMapping("/flights")
    public String flights(Model model) {
        return "flights";

    }

}
