package com.hoanglinh.service;

import com.hoanglinh.model.Blog;

import java.util.List;

public interface Blogservice {
    List<Blog> findAll() ;

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
