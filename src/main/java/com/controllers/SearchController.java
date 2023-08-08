//package com.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Model.ElasticBook;
//import com.services.ElasticBookService;
//
//@RestController
//@RequestMapping("/search")
//public class SearchController {
//    private final ElasticBookService elasticBookService;
//
//    @Autowired
//    public SearchController(ElasticBookService elasticBookService) {
//        this.elasticBookService = elasticBookService;
//    }
//
//    @GetMapping
//    public ResponseEntity<Iterable<ElasticBook>> searchBooks(@RequestParam String query) {
//        Iterable<ElasticBook> results = elasticBookService.searchBooks(query);
//        return new ResponseEntity<>(results, HttpStatus.OK);
//    }
//    
//
//}
