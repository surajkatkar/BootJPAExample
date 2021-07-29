package com.bootjpaexample.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bootjpaexample.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List <User> findByName(String name);
	
	public List <User> findByCity(String city);
	
	public List <User> findByNameStartingWith(String prefix);
	public List <User> findByNameEndingWith(String suffix);
	public List <User> findByNameContaining(String words);
	public List <User> findByNameLike(String name);
	
	//public List <User> findByAgeLessThan(int age);
	//public List <User> findAgeGreaterThan(int age);
	
	//public List <User> findByAgeIn(int age);
	
	public List <User> findByNameOrderByName(String name);
	
	@Query("select u from User u")
	public List <User> getAllUser();
	
	@Query("select u from User u where u.name =:n and u.city=:c")
	public List <User> getAllUsrByName(@Param("n")String name,@Param("c")String city);
	
	@Query(value="select * from user",nativeQuery=true)
	public List <User> getUser();
}
