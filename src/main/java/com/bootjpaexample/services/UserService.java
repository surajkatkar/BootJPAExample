package com.bootjpaexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootjpaexample.entity.User;
import com.bootjpaexample.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public void saveUser(User user)
	{
		System.out.println(repo.save(user));
	}
	
	public void saveAllUsers(List<User> list)
	{
		System.out.println(repo.saveAll(list));
	}
	
}
