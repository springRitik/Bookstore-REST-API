package com.bookstore.BookstoreApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.BookstoreApi.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
