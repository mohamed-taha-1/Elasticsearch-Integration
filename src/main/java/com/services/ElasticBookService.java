//package com.services;
//
//import java.util.stream.Collectors;
//
//import org.elasticsearch.index.query.QueryBuilders;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.client.erhlc.NativeSearchQuery;
//import org.springframework.data.elasticsearch.client.erhlc.NativeSearchQueryBuilder;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.SearchHit;
//import org.springframework.data.elasticsearch.core.SearchHits;
//import org.springframework.stereotype.Service;
//
//import com.Model.ElasticBook;
//import com.Model.repositories.ElasticBookRepository;
//
//@SuppressWarnings("deprecation")
//@Service
//public class ElasticBookService {
//	private final ElasticsearchOperations elasticsearchOperations;
//	private final ElasticBookRepository elasticBookRepository;
//
//	@Autowired
//	public ElasticBookService(ElasticsearchOperations elasticsearchOperations,
//			ElasticBookRepository elasticBookRepository) {
//		this.elasticsearchOperations = elasticsearchOperations;
//		this.elasticBookRepository = elasticBookRepository;
//	}
//
//	public Iterable<ElasticBook> searchBooks(String query) {
//		NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
//				.withQuery(QueryBuilders.matchQuery("title", query)).build();
//
//		SearchHits<ElasticBook> searchHits = elasticsearchOperations.search(searchQuery, ElasticBook.class);
//		return searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
//	}
//
//}
