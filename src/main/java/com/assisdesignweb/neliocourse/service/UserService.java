package com.assisdesignweb.neliocourse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assisdesignweb.neliocourse.entities.User;
import com.assisdesignweb.neliocourse.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findaAll(){
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
