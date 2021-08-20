package pl.sda.phonebook;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class PhoneBookEntry {
    @javax.validation.constraints.NotBlank
    @Length(min = 3)
    String firstName;
    @javax.validation.constraints.NotBlank
    String phoneNumber;
}
