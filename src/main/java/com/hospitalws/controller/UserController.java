package com.hospitalws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(){
		return "success";		
	}
}
