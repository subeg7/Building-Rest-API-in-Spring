/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.database;

import com.example.SpringMvc.Entities.Blog;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer>{
       List<Blog> findByTitleContainingOrContentContaining(String text,String textAgain);
}