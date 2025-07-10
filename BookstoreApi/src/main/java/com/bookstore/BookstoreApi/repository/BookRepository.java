package com.bookstore.BookstoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.BookstoreApi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	

	

	}

