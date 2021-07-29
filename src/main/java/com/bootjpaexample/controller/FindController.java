package com.bootjpaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootjpaexample.services.UserService;

@Controller
public class FindController {
	@Autowired
	UserService service;
	
	@GetMapping("/alluser")
	@ResponseBody
	public String findAll()
	{
		 service.getAllUsers();
		 return "<h1>success</h1>";
	}
	
	@GetMapping(value="/find/{name}")
	@ResponseBody
	public String findByName(@PathVariable("name")String name)
	{
		System.out.println("inside find by name");
		service.findByName(name);
		return "<h1> successfully find </h1>";
	}
	
	@GetMapping("/findcity/{city}")
	@ResponseBody
	public String findByCity(@PathVariable("city")String city)
	{
		System.out.println("inside find by city");
		service.findByCity(city);
		return "<h1> successfully find </h1>";
	}
}
