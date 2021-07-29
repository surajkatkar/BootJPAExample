package com.bootjpaexample.repo;

import org.springframework.data.repository.CrudRepository;

import com.bootjpaexample.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
