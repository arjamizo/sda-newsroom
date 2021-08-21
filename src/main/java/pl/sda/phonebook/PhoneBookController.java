package pl.sda.phonebook;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring5.expression.Fields;

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
        modelMap.addAttribute("form", new PhoneBookEntry());
        modelMap.addAttribute("isAuth", this.getIsAuth());
        return "phonebook/index";
    }

    private boolean getIsAuth() {
        boolean isAuth = org.springframework.security.core.context.SecurityContextHolder
                .getContext().getAuthentication().getPrincipal()
                instanceof org.springframework.security.core.userdetails.UserDetails;
        return isAuth;
    }

    @PostMapping("")
    @SneakyThrows
    public String create(@javax.validation.Valid @ModelAttribute("form") PhoneBookEntry entry, final BindingResult errors, final ModelMap modelMap) {
        modelMap.addAttribute("isAuth", this.getIsAuth());
        // javax.validation.ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
        // javax.validation.Validator validator = factory.getValidator();
        // System.out.println(validator.validate(entry));
        if (!errors.hasErrors()) {
            phonesDatabase.add(entry);
            modelMap.addAttribute("form", new PhoneBookEntry());
        } else {
            System.out.println(errors);
            modelMap.addAttribute("form", entry);
        }
        modelMap.addAttribute("entries", phonesDatabase.findAll());
        return "phonebook/index";
    }
}
