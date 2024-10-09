package com.thullyoo.graphl_api.controller;

import com.thullyoo.graphl_api.data.Writer;
import com.thullyoo.graphl_api.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class WriterController {

    @Autowired
    private WriterService writerService;

    @SchemaMapping(typeName = "Mutation", value = "registerWriter")
    public Collection<Writer> registerWriter(@Argument String name, @Argument int age){
        return writerService.registerWriter(name, age);
    }

    @QueryMapping
    public Writer writerById(@Argument String id){
        return writerService.writerById(id);
    }

}
