package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Book;
import com.Model.repositories.BookRepository;


@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
    
    public void updateTitlte( String newTitle, Long id ) {
    	Book book = bookRepository.findById(id).orElse(null);
        if (book != null) {
            book.setTitle(newTitle);
            bookRepository.save(book);
        } else {
            // Handle book not found error, or take appropriate action
            throw new IllegalArgumentException("Book not found with ID: " + id);
        }
    	
    }

 
}
