package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
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
}