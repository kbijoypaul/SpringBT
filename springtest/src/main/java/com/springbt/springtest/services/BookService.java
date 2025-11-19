package com.springbt.springtest.services;

import com.springbt.springtest.models.Book;
import com.springbt.springtest.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    public Book Save(Book book) {
        return bookRepository.save(book);
    }
}
