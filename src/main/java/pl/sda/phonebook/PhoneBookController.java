package pl.sda.phonebook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/phonebook")
public class PhoneBookController {
    @GetMapping("")
    String index(final ModelMap modelMap) {
        modelMap.addAttribute("entries",
                new Object[] {"Jan +123", "Janusz +321"});
        return "phonebook/index";
    }
    @PostMapping("")
    String create(@RequestParam("firstName") final String firstName,
                  @RequestParam("phoneNumber") final String phoneNumber,
                  final ModelMap modelMap) {
        List<String> phonesDatabase = new ArrayList<>();
        // phonesDatabase.add(firstName + " " + phoneNumber);
        phonesDatabase.add(String.format("%s %s%n", firstName, phoneNumber));
        modelMap.addAttribute("entries", phonesDatabase);
        return "phonebook/index";
    }
}
