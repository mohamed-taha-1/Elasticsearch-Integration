package com.entities.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.entities.ElasticBook;

@Repository

public interface ElasticBookRepository extends ElasticsearchRepository<ElasticBook, Long> {
    // Custom queries can be defined here if needed
}
