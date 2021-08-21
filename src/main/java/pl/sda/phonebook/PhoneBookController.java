package pl.sda.phonebook;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/phonebook")
public class PhoneBookController {
    @Autowired
    PhoneBookRepository repository;

    @GetMapping("")
    String index(final ModelMap modelMap, @AuthenticationPrincipal Principal user) {
        modelMap.addAttribute("entries", repository.findAll());
        modelMap.addAttribute("form", new PhoneBookEntry());
        modelMap.addAttribute("isAuth", this.getIsAuth());
        fillModel(modelMap, user);
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
    public String create(@javax.validation.Valid @ModelAttribute("form") PhoneBookEntry entry,
                         final BindingResult errors, final ModelMap modelMap,
                         @AuthenticationPrincipal Principal user) {
        modelMap.addAttribute("isAuth", this.getIsAuth());
        fillModel(modelMap, user);
        // javax.validation.ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
        // javax.validation.Validator validator = factory.getValidator();
        // System.out.println(validator.validate(entry));
        if (!errors.hasErrors()) {
            repository.add(entry);
            modelMap.addAttribute("form", new PhoneBookEntry());
        } else {
            System.out.println(errors);
            modelMap.addAttribute("form", entry);
        }
        modelMap.addAttribute("entries", repository.findAll());
        return "phonebook/index";
    }

    void fillModel(ModelMap modelMap, Principal user) {
        modelMap.addAttribute("user", user.getName());
    }
}
