package com.example.springbootupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/hello")
    public String hello() {
        bookService.hello();
        return "teddy";
    }

    @GetMapping("/book")
    public Book book() {
        bookRepository.findAll().forEach(System.out::println);
        Book book = bookRepository.findByIsbn("123123");
        return book;
    }
}
