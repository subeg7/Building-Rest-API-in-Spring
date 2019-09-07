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


import java.util.*;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.util.Map;


/**
 *
 * @author Acerimport java.util.List;

 */
@RestController
public class BlogController {
    
    @Autowired
    BlogRepository blogRepository;
    
    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
    }
    
    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        Blog blog  = new Blog(id+":A small journey","... better be a spring season");
        return blogRepository.findById(blogId);
    }
    
    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return blogRespository.save(new Blog(title, content));
    }
    
    
}
