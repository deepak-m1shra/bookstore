package com.learning.springbootreactfullstack.controller;

import com.learning.springbootreactfullstack.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book = BookDto.builder()
                .title("My first Book title")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book);

        return ResponseEntity.ok(books);
    }
}
