package pits;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String welcome(Model model) {
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";

    }

    @RequestMapping("/old_login")
    public String login(Model model) {
        return "old_login";
    }
}
