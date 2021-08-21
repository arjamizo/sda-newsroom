package pl.sda.phonebook;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository // lub @Component, jaka jest roznica?
public class PhoneBookRepository {
    List<PhoneBookEntry> list = new ArrayList<>();
}
