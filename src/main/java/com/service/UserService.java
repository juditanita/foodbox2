package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.User;

@Service
public interface UserService{
	
	User findByUserName(String username);
	User findByEmail(String email);
	

	


	User saveUser(User user);

	User updateUser(User user);

	

	

	void deleteUser(Integer id);

	List<User> findAllUsers();

	Long numberOfUsers();


	

	

	

}
