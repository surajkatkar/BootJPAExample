package com.bootjpaexample.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootjpaexample.entity.User;
import com.bootjpaexample.services.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/saveone")
	@ResponseBody
	public String saveUser()
	{
		User user= new User();
		user.setName("sachin");
		user.setCity("mumbai");
		user.setStatus("he is cricketer");
		service.saveUser(user);
		return "<h1>Success Save</h1>";
	}
	
	@GetMapping("/save")
	public String userSave()
	{
		System.out.println("inside save controller");
		User user=new User();
		user.setName("karan");
		user.setCity("pune");
		user.setStatus("I am Php programmer");
		System.out.println(user);
		//Save single user to database
		//service.saveUser(user);

		//Save multiple object at a time
		List<User> list=new ArrayList<User>();	//created list to store object
		list.add(user);

		User user2=new User();
		user2.setName("kiran");
		user2.setCity("kolhapur");
		user2.setStatus("I am DB programmer");
		list.add(user2);
		
		User user3=new User();
		user3.setName("kusum");
		user3.setCity("solhapur");
		user3.setStatus("I am dotnet programmer");
		list.add(user3);
		
		//three ways to iterate list or Iterator object using while, for loop , forEach method
		Iterator<User> itr=list.iterator();
		while(itr.hasNext())
		{
			User us=itr.next();
			String name=us.getName();
			String city=us.getCity();
			String stat=us.getStatus();
			System.out.println(name + "...."+city+",,,,,"+stat);
			System.out.println(us);
		}
		
		for (User user4 : list) 
		{
			System.out.println(user4);
		}
		
		System.out.println("new foreach method");
		
		list.forEach(user5->{
			System.out.println(user5);
		});
		
		service.saveAllUsers(list);
		return "success";
	}
	
}
