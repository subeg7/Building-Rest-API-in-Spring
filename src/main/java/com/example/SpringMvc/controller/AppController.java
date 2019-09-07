
package com.example.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController{
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
        
        @RequestMapping("/test")
	public ModelAndView secondPage() {
                ModelAndView model = new ModelAndView("test");
                model.addObject("textData","Inventions that changed the world");
                return model;
	}
        
        @GetMapping("/form")
	public ModelAndView GetFormView() {
                ModelAndView model = new ModelAndView("test");
                model.addObject("textData","Form Page");
               return model;
	}

}
