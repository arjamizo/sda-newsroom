package pl.sda.sdanewsroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {
    @GetMapping
    public String index() {
        return "index";
    }
}
