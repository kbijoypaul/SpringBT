package com.springbt.springtest.repositories;

import com.springbt.springtest.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
