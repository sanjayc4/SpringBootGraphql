package com.sanjutech;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String Name, Integer pageCount, Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "Geeta", 789,1),
            new Book(2, "Quran", 675, 2),
            new Book(3, "How to talk", 500, 1),
            new Book(4, "Life is journey", 300, 2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(book -> book.id.equals(id))
                .findFirst();
    }



}
