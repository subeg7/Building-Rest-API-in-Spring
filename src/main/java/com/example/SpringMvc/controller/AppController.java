/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMvc.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Acer
 */
public class AppController {
//     @RequestMapping("/servlet",method=RequestMethod.GET)
        @GetMapping("/servlet")
        public String getServletPage(ModelMap model){
            return "/simpleUI.html";
//            model.addAttribute(attributeName, model);
        }
     
}
