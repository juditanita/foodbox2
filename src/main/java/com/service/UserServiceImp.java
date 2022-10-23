package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repo.UserRepository;

@Service
public abstract class UserServiceImp implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Override
	public User saveUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

   @Override
	   public User updateUser(User user) {
		
		return userRepository.save(user);
	}


  @Override
   public void deleteUser(Integer id) {
	    userRepository.deleteById(id);
   }

  @Override
  public User findByUserName(String username) {
	return userRepository.findByUsername(username).orElse(null);
}

  @Override
  public List<User> findAllUsers(){
	  
	  return userRepository.findAll();
	  
	  }
  
  
  @Override
  public Long numberOfUsers() {
	     return userRepository.count();
}
  

}
