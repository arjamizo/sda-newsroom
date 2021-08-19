package pl.sda.sdanewsroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {
    @GetMapping("/quiz")
    public String questionsForm() {
        return "questions";
    }
    @PostMapping("/quiz")
    public String verifyAnswers() {
        return "questions";
    }
}
