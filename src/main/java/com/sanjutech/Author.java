package com.sanjutech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id , String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Krishna"),
            new Author(2, "Ram")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }
}
