package com.thullyoo.graphl_api.data;

public class Writer {

    private String id;
    private String name;
    private Integer Age;

    public Writer(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
