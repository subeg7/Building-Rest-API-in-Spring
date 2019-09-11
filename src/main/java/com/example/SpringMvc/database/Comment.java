/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.database;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author Acer
 */
@Entity
public class Comment   {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int blog_id;
   private String comment;

   
   @ManyToOne
   @JoinColumn
    private Blog blog;


    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
//    public Comment(String comment,blog_){
        
//    }
    
    
        
    
}
