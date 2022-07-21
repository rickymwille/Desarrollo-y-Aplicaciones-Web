/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StoriesForEveryone.service;

import com.StoriesForEveryone.entity.Blog;
import com.StoriesForEveryone.repository.BlogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



/**
 *
 * @author carlo
 */
public class BlogService implements IBlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public List<Blog> listBlog() {
        return (List<Blog>) blogRepository.findAll();
    }

    
}