package com.hoanglinh.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;
    private String title;
    private String time;



    public Blog(Long id, String name, String content, String title, String time) {
        this.id=id;
        this.name=name;
        this.content = content;
        this.title = title;
        this.time = time;

    }

    public Blog() {

    }

    public  Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
