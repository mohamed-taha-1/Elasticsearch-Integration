package com.Model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	/*
	 * @org.springframework.data.jdbc.repository.query.Modifying
	 * 
	 * @Query("UPDATE Book b SET b.title = :newTitle WHERE b.id = :targetId" ) void
	 * updateTitle(@Param("newTitle") String title, @Param("targetId") Long id);
	 * 
	 */
	
	
	Optional<List<Book>> findByTitle( String name);  

}
