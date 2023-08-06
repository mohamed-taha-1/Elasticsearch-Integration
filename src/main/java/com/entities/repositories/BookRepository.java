package com.entities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {



}
