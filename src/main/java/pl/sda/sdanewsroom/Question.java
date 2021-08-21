package pl.sda.sdanewsroom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Question {
    Integer id;
    final String questionText;
    final String a;
    final String b;
    final Integer ans;
}
