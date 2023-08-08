package com.utils;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import com.Model.Book;
import com.Model.ElasticBook;

@Component
public class BookEntityListener {
	private final ElasticsearchOperations elasticsearchOperations;

	@Autowired
	public BookEntityListener(ElasticsearchOperations elasticsearchOperations) {
		this.elasticsearchOperations = elasticsearchOperations;
	}

	@PostPersist
	@PostUpdate
	public void indexBook(Book book) {
		ElasticBook elasticBook = new ElasticBook();
		elasticBook.setId(book.getId());
		elasticBook.setTitle(book.getTitle());
		elasticsearchOperations.save(elasticBook);
	}

}
