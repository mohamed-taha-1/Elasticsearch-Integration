package com.Model;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;


@Data
@Table("book")
public class Book {
    
	@Id
	@Column("id")
    private Long id;
    private String title;
    private String author;

}
