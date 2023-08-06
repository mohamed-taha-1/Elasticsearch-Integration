package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Book;
import com.entities.repositories.BookRepository;

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

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

 
}
