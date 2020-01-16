package com.example.books;

import com.example.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


        @Autowired
        private BookRepository bookrepo;

        public List<Book> getAllBook() {
//        return topics;
            List<Book> books = new ArrayList<>();
            bookrepo.findAll().forEach(books::add);
            return books;
        }

        public Book getBook(int id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
            return bookrepo.findById(id).orElse(null);

        }

        public void addBook(Book books) {
//        topics.add(topic);
            bookrepo.save(books);

        }

       public void updateBook(int id, Book books) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
            bookrepo.save(books);
        }


        public void deleteBook(int id) {
//        topics.removeIf(t -> t.getId().equals(id));
            bookrepo.deleteById(id);

        }
    }