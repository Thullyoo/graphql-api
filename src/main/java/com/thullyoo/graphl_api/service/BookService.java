package com.thullyoo.graphl_api.service;

import com.thullyoo.graphl_api.data.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Service
public class BookService{

    Map<String, Book> books = new HashMap<>();

    public Collection<Book> createBook(String title, String description, String writerId){
        Book newBook = new Book(UUID.randomUUID().toString(), title, description, writerId);
        books.put(newBook.getId(), newBook);
        System.out.println(newBook.toString());
        return books.values();
    }

    public Book bookById(String id){
        return books.get(id);
    }

}


