package com.thullyoo.graphl_api.data;

public class Book {

    private String id;
    private String title;
    private String description;
    private String writerId;


    public Book(String id, String title, String description, String writerId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.writerId = writerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }
}
