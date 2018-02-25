package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {

    private @Id @GeneratedValue Long id;
    private String title;
    private String author;

    private Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
