package com.example.springbootupdate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Async
    public void hello() {
        System.out.println("====================");
        System.out.println("hello " + Thread.currentThread().getName());
        System.out.println("====================");
    }

    @Scheduled(fixedDelay = 1000 * 2)
    public void hi() {
        System.out.println("hi " + Thread.currentThread().getName());
    }

    @PostConstruct
    public void init() {
        Book book = new Book();
        book.setIsbn("123123");
        book.setTitle("Spring Boot Update");
        book.setPublished(LocalDate.of(2020, 10, 15));
        bookRepository.save(book);
    }
}
