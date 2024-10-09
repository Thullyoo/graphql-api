package com.thullyoo.graphl_api.controller;

import com.thullyoo.graphl_api.data.Book;
import com.thullyoo.graphl_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;


@Controller
public class BookController {


    @Autowired
    private BookService bookService;

    @MutationMapping
    public Collection<Book> createBook(@Argument String title, @Argument String description, @Argument String writerId){
        return bookService.createBook(title,description,writerId);
    }

    @SchemaMapping(typeName = "Query", value = "bookById")
    public Book bookById(@Argument String id){
        return bookService.bookById(id);
    }

}
