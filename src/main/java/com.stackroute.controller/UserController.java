package com.stackroute.controller;


import com.stackroute.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

       // map.addAttribute("greeting","Welcome to Stackroute!");
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("display");


       String userName = request.getParameter("username");
       User user = new User(userName,"male");
       modelAndView.addObject("name", user.getUserName());

       // Converrt  to json Object


        return modelAndView;
    }

    @RequestMapping("/hello")
    public String greet(Model model){

        model.addAttribute("username","sehun");
     return "hello";
    }

    @RequestMapping("/hello2")
    public String greet1(ModelMap modelMap){
        //to do
        modelMap.addAttribute("username","Chanyeol");
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String greet2(ModelAndView modelAndView){
        //to do
        modelAndView.setViewName("display");
        modelAndView.addObject("username","Baek");
        return "hello3";
    }


}
