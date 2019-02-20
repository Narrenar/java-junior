package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/menu")
    public String menu(@RequestParam(name="menu", required=false, defaultValue="It's MAIN MENU, Body ;)") String menu, Model model) {
        model.addAttribute("menu", menu);
        return "menu";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="greeting", required=false, defaultValue="Body") String greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "greeting";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name="about", required=false, defaultValue="The humblest person in the Universe") String about, Model model) {
        model.addAttribute("about", about);
        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(@RequestParam(name="contacts", required=false, defaultValue="+7(999)666-69-69, bestperson@inthe.uni") String contacts, Model model) {
        model.addAttribute("contacts", contacts);
        return "contacts";
    }

    @GetMapping("/news")
    public String news(@RequestParam(name="news", required=false, defaultValue="Here must be some news but something went wrong") String news, Model model) {
        model.addAttribute("news", news);
        return "news";
    }
}