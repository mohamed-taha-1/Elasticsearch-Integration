package com.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Book;
import com.Model.repositories.BookRepository;
import com.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    

    private final BookRepository bookRepo;
    

    @Autowired
    public BookController(BookService bookService, BookRepository bookRepo) {
        this.bookService = bookService;
		this.bookRepo = bookRepo;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Book>> getAllBooks() {
        Iterable<Book> books = bookService.findAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    
    @PutMapping("/{id}/title")
    public ResponseEntity<String> updateBookTitle(@PathVariable Long id, @RequestParam String newTitle) {
        try {
            bookService.updateTitlte(newTitle, id);
            return ResponseEntity.ok("Book title updated successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Failed to update book title: " + e.getMessage());
        }
    }
    
    
    @GetMapping("/{title}")
    public Iterable<Book> findByTitle(@PathVariable String title) {
    	
    	return bookRepo.findByTitle(title).get();
    	
    }

   
}
