/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.controller;


import com.example.SpringMvc.BlogRepository;
import com.example.SpringMvc.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

/**
 *
 * @author Acerimport java.util.List;

 */
public class BlogController {
    
    @Autowired
    BlogRepository blogRepository;
    
    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
    }
    
    
}
