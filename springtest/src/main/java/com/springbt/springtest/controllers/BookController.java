package com.springbt.springtest.controllers;

import com.springbt.springtest.models.Book;
import com.springbt.springtest.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        try {
            System.out.println("Creating book: {}" + book);
            logger.info("Creating book: {}", book);
            return bookRepository.save(book);
        } catch (Exception e) {
            logger.error("Error creating book", e);
            throw e;
        }
    }

}
