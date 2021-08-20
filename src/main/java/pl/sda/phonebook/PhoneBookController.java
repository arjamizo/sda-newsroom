package pl.sda.phonebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phonebook")
public class PhoneBookController {
    @GetMapping("")
    String index() {
        return "phonebook/index";
    }
}
