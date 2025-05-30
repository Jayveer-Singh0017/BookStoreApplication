package com.bookstore.BookStoreApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.BookStoreApp.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
