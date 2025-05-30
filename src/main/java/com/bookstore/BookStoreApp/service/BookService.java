package com.bookstore.BookStoreApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.BookStoreApp.entity.Book;
import com.bookstore.BookStoreApp.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
	}
	
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bRepo.findById(id).get();
	}
	
	public void deleteBook(int id) {
		bRepo.deleteById(id);
	}
}
