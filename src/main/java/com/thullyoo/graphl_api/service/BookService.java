package com.thullyoo.graphl_api.service;

import com.thullyoo.graphl_api.data.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Service
public class BookService{

    Map<String, Book> books = new HashMap<>();

    public Map<String, Book> createBook(String title, String description, String writerId){
        Book newBook = new Book(UUID.randomUUID().toString(), title, description, writerId);
        books.put(newBook.getId(), newBook);
        return books;
    }

    public Book bookById(String id){
        return books.get(id);
    }

}


