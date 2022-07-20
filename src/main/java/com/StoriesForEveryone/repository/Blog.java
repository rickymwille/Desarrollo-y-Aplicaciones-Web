/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.repository;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author carlo
 */
 @Entity
@Table(name = "blogs")
public class Blog {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String blogs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBlogs() {
        return blogs;
    }

    public void setBlogs(String blogs) {
        this.blogs = blogs;
    }



}
  

