package com.springbt.springtest.services;

import com.springbt.springtest.models.Author;
import com.springbt.springtest.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll() {
        return authorRepository.findAll();
    }
    public Author Save(Author author) {
        return authorRepository.save(author);
    }
}
