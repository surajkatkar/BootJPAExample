package com.bootjpaexample.services;

import java.util.List;
import java.util.Optional;

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
	
	public User updateUser(int id)
	{
		Optional<User> optional=repo.findById(id);
		User user=optional.get();
		user.setName("suraj katkar");
		User result=repo.save(user);
		return result;
	}
	
	public void deleteUser(int id)
	{
		repo.deleteById(id);
		System.out.println("deleted");
	}

	public void findByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("inside service find by name");
		List <User>list=repo.findByName(name);
		list.forEach(user->System.out.println(user));
	}
	
	public void findByCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("inside service find by city");
		List <User>list=repo.findByCity(city);
		list.forEach(user->System.out.println(user));
	}
	
	public void getAllUsers()
	{
		List <User> list=repo.getAllUser();
		list.forEach(user->System.out.println(user));
	}
}
