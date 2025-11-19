package com.springbt.springtest.controllers;

import com.springbt.springtest.models.Author;
import com.springbt.springtest.repositories.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        try {
            System.out.println("Creating Author: {}" + author);
            logger.info("Creating book: {}", author);
            return authorRepository.save(author);
        } catch (Exception e) {
            logger.error("Error creating Author", e);
            throw e;
        }
    }

}
