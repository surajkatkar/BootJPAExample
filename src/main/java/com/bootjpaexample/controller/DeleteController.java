package com.bootjpaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootjpaexample.services.UserService;

@Controller
public class DeleteController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/delete/{id}")
	@ResponseBody
	public String deleteController(@PathVariable("id")int id)
	{
		System.out.println("inside delete");
		service.deleteUser(id);
		return "<h1>successfully deleted</h1>";
	}
}
