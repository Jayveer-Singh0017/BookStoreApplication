package com.bookstore.BookStoreApp.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.BookStoreApp.entity.Book;
import com.bookstore.BookStoreApp.entity.MyBookList;
import com.bookstore.BookStoreApp.service.BookService;
import com.bookstore.BookStoreApp.service.MyBookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private MyBookService myBookService; 
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
	public ModelAndView availableBooks() {
		List<Book> list = bookService.getAllBook();
		ModelAndView mView = new ModelAndView();
		mView.setViewName("availableBooks");
		mView.addObject("book",list);
		return mView;
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		bookService.save(b);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String myBooks(Model model) {
		List<MyBookList> list = myBookService.getAllMyBooks();
		model.addAttribute("book",list); 
		return "myBooks";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b = bookService.getBookById(id);
		MyBookList myBookList = new MyBookList(b.getId(),b.getBook_name(),b.getBooks_author(),b.getBook_price());
		myBookService.saveMyBooks(myBookList);
		return "redirect:/my_books";
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
	    Book book =	bookService.getBookById(id);
	    model.addAttribute("book",book);
		return "bookEdit";
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		bookService.deleteBook(id);
		return "redirect:/available_books";
	}
}
