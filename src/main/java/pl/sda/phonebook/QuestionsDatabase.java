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
            "Czy <dependency>spring-boot-starter-validation</dependency> w pon.xml wystarcza, by zadziałała walidacja hibernate-validator?\ntak\nnie",
            "Czy jeśli modyfikujemy listę w zamockowanym repository, to czy ma znaczenie kiedy przekażemy listę z rekordami do atrybutów widoku?\nnie\ntak, jeśli stworzymy kopię tej listy",
            "Jak można ostylować formularz tak, by w przypadku błędu?\nwarunkowe class lub style\nwarunek w kontrolerze",
            // "Co oznacza # w thymeleaf template?\npole globalne\nalias do evaluacji atrybutu modelu",
            "Czy trzeba przekazywac specjalnie errors do modelu widoku za pomoca modelMap?\nnie (bo jest #fields)\ntak (bo nie ma #fields)",
            "Jak mozna wyswietlic wszystkie bledy thyemeleaf?\nallErrors i hasAnyErrors\nprzejscie przez wszystkie pola", // https://www.baeldung.com/spring-thymeleaf-error-messages
            "Co musi być zrobione po dodaniu nowego dependency w pom.xml (np. hibernate-validator)?\njesli devtools - nic\nrestart serwera/tomcat-a",
            // "Could not resolve parameter [0] in java.lang.Error...: no suitable resolver?\n\n",
            "Czy kolejność umieszczenia BindingResult (Erorrs) ma znaczenie?\ntak\nnie",
            "Czy nazwa argumentu metody kontrolera POST musi miec nazwe arg. zgodna z th:object w celu walidacji Errors/BindinResult?\ntak\nnie",
    }));
}
