package com.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName = "books", createIndex = false)
@Data
public class ElasticBook {
    @Id
    private Long id;
    private String title;
}
