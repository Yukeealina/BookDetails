package com.example.books;

import com.example.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {         //interger is the datatype of primary key of a class"book"
}
