/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.StoriesForEveryone.repository;

import com.StoriesForEveryone.entity.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author carlo
 */
@Repository
public interface BlogRepository extends CrudRepository<Blog,Long>{
    
}
