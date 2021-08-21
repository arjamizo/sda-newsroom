package pl.sda.phonebook;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository // lub @Component, jaka jest roznica?
public class PhoneBookRepository
//    implements org.springframework.data.jpa.repository.JpaRepository
//    implements org.springframework.data.repository.CrudRepository
{
    List<PhoneBookEntry> list = new ArrayList<>();
    List<PhoneBookEntry> findAll() {
        return this.list;
    }

    public void add(PhoneBookEntry entry) {
        this.list.add(entry);
    }
}
