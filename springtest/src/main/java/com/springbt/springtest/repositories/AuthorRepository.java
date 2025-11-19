package com.springbt.springtest.repositories;

import com.springbt.springtest.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
