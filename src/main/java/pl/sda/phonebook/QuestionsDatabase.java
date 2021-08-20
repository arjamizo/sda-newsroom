package pl.sda.phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionsDatabase {
    static List<String> entries = new ArrayList(Arrays.asList(new String[]{
            "Gdzie należy umieścić xmlns:th=\"http://www.thymeleaf.org\"\nw <html>\nw <body>",
            "Jaka składnia jest w th:each?\nentry : ${entries}\n$entry : {entries}",
    }));
}
