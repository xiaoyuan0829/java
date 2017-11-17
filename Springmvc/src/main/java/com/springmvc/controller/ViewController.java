package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.ViewService;

@Controller
public class ViewController {
	
	@Autowired
	private ViewService viewService;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String HelloController(){
		return viewService.helloService();
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String helloUser(@ModelAttribute() User user){
		return "user";
	}
}
