package com.thullyoo.graphl_api.data;

public class LibraryData {

    record Book(String id, String title, String description, String writerId){

    }

    record Writrer(String id, String name, Integer Age){

    }

}
