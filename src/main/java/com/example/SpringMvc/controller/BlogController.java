/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.controller;


import com.example.SpringMvc.Entities.Blog;
import com.example.SpringMvc.Entities.Comment;
import com.example.SpringMvc.database.BlogRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
//import java.util.Map;


/**
 *
 * @author Acerimport java.util.List;
 */
@RestController("/api")
public class BlogController {
    
        @Autowired
        BlogRepository blogRepository;
    
        @GetMapping("/")    
        public String homePage(){
          return "<h1>Give me one reason and i will turn around</h1>";
        }
        
       @GetMapping("/blogs")
        public List<Blog> showAllBlogs() throws Exception{
            List<Blog> blogs = null ;
            try{
                 blogs = blogRepository.findAll();

            }catch(Exception e){
//                return "blog is empty";
            }
            return blogs;
            
        }
        
        @GetMapping("/blog/{id}")
        public List<Comment> blogComments(@PathVariable String id) throws Exception{
            int blogId = Integer.parseInt(id);
            List<Comment> comments = null ;
            try{
             
                   Blog blog = blogRepository.findById(blogId).get();
                   comments = blog.getComments();
//                   String str = blog.getTitle();

            }catch(Exception e){
//                return "blog is empty";
            }
          return comments;
            
        }
        
        
        
        @PostMapping("/create")
        public String createNewBlog(@RequestBody Map<String, String> body){
                String userEnteredTitle = body.get("title");
                String userEnteredContent = body.get("content");
                
                blogRepository.save(new Blog(userEnteredTitle,userEnteredContent    ));
                return "Success!! your blog has been stored successfully";
        }

}