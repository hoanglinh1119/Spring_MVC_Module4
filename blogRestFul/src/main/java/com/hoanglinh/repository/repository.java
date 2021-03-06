package com.hoanglinh.repository;

import com.hoanglinh.model.Blog;

import java.util.List;

public interface repository<T> {
    List<T> findAll();
    Blog findById (Long id);
    void  save(T model);
    void remove(Long id);
}
