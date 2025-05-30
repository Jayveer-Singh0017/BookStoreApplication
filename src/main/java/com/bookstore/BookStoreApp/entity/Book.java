package com.bookstore.BookStoreApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String book_name;
	private String books_author;
	private String book_price;
	public Book(int id, String book_name, String books_author, String book_price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.books_author = books_author;
		this.book_price = book_price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBooks_author() {
		return books_author;
	}
	public void setBooks_author(String books_author) {
		this.books_author = books_author;
	}
	public String getBook_price() {
		return book_price;
	}
	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}
	
	
}
