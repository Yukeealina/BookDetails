package com.example.controller;

import com.example.entities.Book;
import com.example.books.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

@Autowired
private BookService bookserv;

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return bookserv.getAllBook();
    }

    @RequestMapping("/books/{id}")
    public Book getBooks(@PathVariable int id) {

        return bookserv.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/book")
    public void addBooks(@RequestBody Book book) {

        bookserv.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
    public void updateBooks(@RequestBody Book book, @PathVariable int id) {
        bookserv.updateBook(id, book);
//        System.out.println("Put operation");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
    public void deleteBooks(@PathVariable int id) {
        bookserv.deleteBook(id);

    }


}
