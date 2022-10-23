package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

	Optional<User>findByUsername(String username);
	
	Optional<User>findById(int id);

	Optional<User>findByEmail(String email);

	

}
