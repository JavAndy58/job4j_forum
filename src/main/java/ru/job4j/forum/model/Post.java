package ru.job4j.forum.model;

import lombok.Data;

import java.util.Calendar;

@Data
public class Post {
    private int id;
    private String name;
    private String description;
    private Calendar created;

    public static Post of(String name) {
        Post post = new Post();
        post.name = name;
        return post;
    }
}
