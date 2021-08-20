package pl.sda.phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionsDatabase {
    static List<String> entries = new ArrayList(Arrays.asList(new String[]{
            "Gdzie należy umieścić xmlns:th=\"http://www.thymeleaf.org\"\nw <html>\nw <body>",
            "Jaka składnia jest w th:each?\nentry : ${entries}\n$entry : {entries}",
            "Jak należy zmodyfikować?\n<form method=\"post\" th:action=\"@{/create}\" th:object=\"${contact}\">\ninaczej",
            "Jak należy skonstruować th:action a parametrem z modelMap?\n<form th:action=\"@{/delete/{id}(id=${contact.id})}\">\ninaczej",
            "Jak sprawdzić która klasa jest ogólniejsza?\nPrawym na klasę i Diagram...\nszukać w plikach .erd w projekcie",
            "Co jest oglólniejszą klasą (jest rodzicem dla drugiej)?\norg.springframework.data.repository.CrudRepository\norg.springframework.data.jpa.repository.JpaRepository",
            "Jak warunkowo wypisać atrybut modelu?\n<span th:if=\"${firstNameError}\">[[${firstNameError}}]]</span>\ninaczej",
            "Gdzie powinna być podejmowana logika walidująca poprawność danych?\nw kontrolerze lub service lub w repozytorium lub w modelu\nw widoku",
    }));
}
