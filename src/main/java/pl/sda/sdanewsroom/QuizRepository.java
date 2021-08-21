package pl.sda.sdanewsroom;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class QuizRepository /* implements CrudRepository*/ {
    List<Question> questions = new ArrayList<>(
            Arrays.asList(new Question[]{
                    new Question("Czy jest możliwe wstrzykiwanie przez adnotację na polu klasy?", "tak", "nie", 1),
                    // https://java.pl.sdacademy.pro/e-podrecznik/spring/komponenty_ioc/#wstrzykiwanie-do-pola
                    new Question("Czy jest możliwe wstrzykiwanie przez adnotację na konstruktorze klasy?", "tak", "nie", 1),
                    // https://java.pl.sdacademy.pro/e-podrecznik/spring/komponenty_ioc/#wstrzykiwanie-przy-pomocy-konstruktora
                    new Question("Czy jest możliwe wstrzykiwanie przez adnotację osobnych argumentów konstruktora klasy?", "tak", "nie", 2),
                    // tip: lombok AllArgsConstructor
                    new Question("Czy jest możliwe wstrzykiwanie przez adnotację na metodzie settera danego pola?", "tak", "nie", 2),
                    // new Question("Jaka to adnotacja", "@Primary", "@Autowired", 2), // to pytanie tylko, jeśli poprzednie poprawnie
                    // https://java.pl.sdacademy.pro/e-podrecznik/spring/komponenty_ioc/#wstrzykiwanie-przy-pomocy-settera
                    new Question("Czy jest możliwe wstrzykiwanie przez adnotację argumentu settera danego pola?", "tak", "nie", 2),
                    // cała metoda musi być autowired
                    new Question("Jak nazywa się klasa pozwalająca na szczegółowe określenie odpowiedzi zwracanej przez @Controller", "ResponseEntity", "ResponseBody", 1),
                    new Question("Na co wpływa podanie @ResponseBody", "na dostosowanie odpowiedzi względem oczekwianej odpowiedzi przez klienta HTTP", "ustawia odpowiedni typ serializacji obiektu Jackson", 1),
                    new Question("Która adnotacja pozwala na wyłuskanie wartości parametru ze ścieżki dla np. żądania GET", "PathVariable", "QueryParameter", 1),
                    new Question("@RequestBody to adnotacja:", "całej metody", "argumentu metody", 1),
                    new Question("Która adnotacja nie moze być użyta zarówno na metodzie jak i całej klasie", "@GetMapping", "@ResponseBody", 1),
                    new Question("@ResponseBody to adnotacja:", "całej metody", "argumentu metody", 1),
                    new Question("Jak nazywa się mechanizm automatycznego wstrzykiwania zależności w modułach aplikacji Spring?", "Dependency Inversion", "Dependency Injection", 1),
                    new Question("Jak nazywa się mechanizm rejestrujący wszystkie zależności dostępne w systemie (by np. mogły być automatycznie wstrzyknięte)?", "Dependency tracking (śledzenie zależności)", "Inversion of control (odwrócenie sterownaia)", 1),
                    new Question("Co m.in. umożliwia korzystanie ze Spring-a?", "Rodzielenie odpowiednich logik aplikacji w osobnych miejscach", "Spring używany jest w większości stron dostępnych w Internecie, więc ma wiele zasobów w sieci", 1),
                    new Question("Jak nazywa się technika programowania pozwalającego na umieszczanie różnych fragmentów logiki biznesowej w różnych miejscach w projekcie", "programowanie aspektowe", "programowanie funkcyjne", 1),
                    new Question("Czy wszystkie bean-y (Obiekty z lifecycle zarządzanym przez Spring) mają ten sam czas życia?", "tak", "nie", 2),
                    new Question("Gdzie można znaleźć cykl życia beanów", "w specyfikacji Spring-a", "w specyfikacji JavaEE Beans", 1),
                    new Question("Czy, by progrmować zgodnie z praktykami springowymi, powinniśmy korzystać z operatora new", "tak (tworzenie instancji klas tj. obiektów)", "jedynie, jeśli chcemy sami zarządzać czasem życia obiektów (listy, obiekty pomocnicze niepowiązane ze Spring - konfiguracje użytych bibliotek)", 1),
                    new Question("Bean to", "klasa zarejetstrowana i zarzdzana przez Spring-a", "instancja klasy utworzona i gotowa do dostarczenia innym komponentom", 1),
                    new Question("Jak można wykonywać odpowiednią logikę w czasie zycia beanów?", "cykl życia beanów (interfejsy lub specjalne metody)", "należy nadzorować ich tworzenie w głównej klasie całej aplikacji", 1),
                    new Question("Czym różni się @Service od @Repository od @Component", "praktycznie niczym", "różnice są niewielkie", 1),
                    new Question("Czym różni się @Component od @Controller", "jedno kieruje żądanie do widoku w arch. MVC", "jedno może mieć tylko jedną instancję w całej aplikacji", 1),
                    new Question("Czym różni się @Controller od @RestController", "jedno kieruje domyślnie wykonywanie programu do folderu z widokami", "różnica kosmetyczna w nazwie (tak samo, jak @Repository i @Service)", 1),
                    new Question("DispacherServlet to", "klasa zaimplementowania w bibliotece spring", "klasa zaimpl. zgodnie ze standardzem JavaEE", 1),
                    new Question("Jak nazywa się adnotacja, która włącza @ComponentScan @EnableAutoConfiguration oraz @SpringBootConfiguration (@Configuration)", "@SpringBootApplication", "SpringApplication.run", 1),
                    new Question("pliki xml były potrzebne w", "spring-boot", "spring", 1),
                    new Question("Jak dzięki dependency injection możemy mockować klasy oferujące interfejs do warstwy persystencji?", "Możemy tworzyć klasy mające np. listę obiektów przechowywanych w RAM, by w odpowiednim momencie zastąpić je interfejsem np. CrudRepository", "wszytstkie klasy opatrzone adnotacją @Repository są automatycznie warstwą persystencji", 1),
                    new Question("Czym różni się CrudRepository od JpaRepository", "", "", 1),
                    new Question("Gdybyśmy mieli kilka repozytorów oferujących zapamiętywnaie danych i chcielibyśmy dodać do nich możliwość dodania metod sortowania i stronicowania, by różne widoki mogły korzystać z nich za pomocą tego samego interfejsu, ale już implementacje byłyby inne, to powinniśmy", "ująć dane metody paginacji w nowym wspólnym interfejsie", "dodać osobne klasy z osobną impl. dla każdego z repozytoriów (inne implementacje)", 1),
                    new Question("Jakie zakresy życia obiektów Springa są stricte per aplikacja?", "Prototype, Singleton", "Request, Session", 1),
                    new Question("Jakie zakresy życia bean-a są związane z obsługiwanym żądaniem użytkownika", "Prototype, Singleton", "Request, Session", 1),
                    new Question("Czym się różni @Repository od @Service", "@Service to warstaw abstrakcji logiki, @Repository to baza danych", "@Service to warstaw abstrakcji logiki, @Repository to warstaw abstrakcji dostępu do bazy danych", 1),
                    new Question("Co powinno używać czego?", "klasa opatrzona @Service powinna mieć pole @Autowired do @Repository", "@Repository powinno mieć pole @Autowired do @Controller", 1),
                    new Question("Co opisuje zasięg prototype beana w spring?", "zawsze nowa instancja", "jedna instancja na całą aplikację", 1),
                    new Question("Co opisuje zasięg singleton beana w spring?", "zawsze nowa instancja", "jedna instancja na całą aplikację", 2),
                    new Question("Jak długo żyje bean @SessionScope", "tak długo jak trwa obslugiwanie zapytania", "tak długo jak trwa obsługa wielu zapytań", 1),
                    new Question("Jak długo żyje bean @RequestScope", "tak długo jak trwa obslugiwanie jednego zapytania lub jego cookies", "tak długo jak trwa obsługa wielu zapytań", 1),
                    new Question("", "", "", 1),
            })
    );
}
