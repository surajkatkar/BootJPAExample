package com.bootjpaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.bootjpaexample.services.UserService;

@Controller
public class UpdateController {
	@Autowired
	UserService service1;
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.GET)
	//@ResponseBody
	public String updateUser(@PathVariable("id")int id)
	{
		service1.updateUser(id);
		return "updateSuccess";
		//return "<h1>This is update page with id</h1>"+id;
	}
}
