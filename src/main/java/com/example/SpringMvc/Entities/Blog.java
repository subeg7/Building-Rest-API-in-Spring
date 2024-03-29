/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Acer
 */
@Entity
@Table(name="blog")
public class Blog  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String title;
    private String content;
   
    @OneToMany(
            mappedBy="blog",
            fetch = FetchType.LAZY
    )
    private List<Comment> allComments;
    
    
    @ManyToMany
    @JoinTable(
      name = "blog_reaction", 
      joinColumns = @JoinColumn(name = "blog_id"), 
      inverseJoinColumns = @JoinColumn(name = "reaction_id")
    )  
    private List<Reaction> blogReactions;

    public List<Reaction> getBlogReactions() {
        return blogReactions;
    }

    public void setBlogReactions(List<Reaction> blogReactions) {
        this.blogReactions = blogReactions;
    }
    
    
    
    
    
    public List<Comment> getComments() {
        return allComments;
    }

    public void setComments(List<Comment> comments) {
        this.allComments = comments;
    }
   
    
    public Blog(){
        
    }
    
    public Blog(String title,String content){
       this.setTitle(title);      
       this.setContent(content);
    }
    
     public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    
    

   
    
    
    
    
}
