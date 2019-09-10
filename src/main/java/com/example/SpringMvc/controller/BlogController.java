/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
//import java.util.Map;


/**
 *
 * @author Acerimport java.util.List;
 */
@RestController
public class BlogController {
    
        @GetMapping("/")    
        public String homePage(){
          return "<h1>Spring is back again</h1>";
        }

}