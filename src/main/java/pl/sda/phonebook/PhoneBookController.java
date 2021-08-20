package pl.sda.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
    @Autowired
    PhoneBookRepository phonesDatabase;

    @GetMapping("")
    String index(final ModelMap modelMap) {
        modelMap.addAttribute("entries", phonesDatabase.findAll());
        return "phonebook/index";
    }
    @PostMapping("")
    String create(PhoneBookEntry entry, final ModelMap modelMap) {
        phonesDatabase/*.findAll()*/.add(entry);
        modelMap.addAttribute("entries", phonesDatabase.findAll());
        return "phonebook/index";
    }
}
