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
        modelMap.addAttribute("entries", new Object[] {new PhoneBookEntry()});
        return "phonebook/index";
    }
    @PostMapping("")
    String create(PhoneBookEntry entry, final ModelMap modelMap) {
        List<PhoneBookEntry> phonesDatabase = new ArrayList<>();
        phonesDatabase.add(entry);
        modelMap.addAttribute("entries", phonesDatabase);
        return "phonebook/index";
    }
}
