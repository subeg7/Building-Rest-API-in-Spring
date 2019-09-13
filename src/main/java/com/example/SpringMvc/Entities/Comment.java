/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.Entities;

import com.example.SpringMvc.Entities.Blog;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author Acer
 */
@Entity
@Table(name="comments")
public class Comment   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
   private String comment;

   
   @ManyToOne
   @JoinColumn(name="blog_id")
   private Blog blog;
   



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
//    public Comment(String comment,blog_){
        
//    }
    
    
        
    
}
