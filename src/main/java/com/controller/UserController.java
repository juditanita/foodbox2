package com.controller;

import java.security.Principal;
import java.time.LocalDateTime;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Role;
import com.entity.Transaction;
import com.entity.User;
import com.service.ProductService;
import com.service.TransactionService;
import com.service.UserService;

import jwt.JWTTokenProvider;

@RestController
public class UserController {
	
	@Autowired
	private JWTTokenProvider jwttokenProvider;
	
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/api/user/registration")
	public ResponseEntity<?>  register(@RequestBody User user){
		if(userService.findByEmail(user.getEmail()) != null) {
			
			return new ResponseEntity<>(HttpStatus.FOUND);
			
		}else {
			user.setRole(Role.USER);
			return new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);
		}
	}
		@GetMapping("/api/user/login")
		public ResponseEntity<?>  getUser(Principal principal){
			
			//principal=httpServletRequest.getUser();
			
			 if(principal == null){
		            //logout will also use here so we should return ok http status.
		            return ResponseEntity.ok(principal);
		        }
			 Authentication auth =
		                (Authentication) principal;
		        User user = userService.findByUserName(auth.getName());
		        
		        user.setToken(jwttokenProvider.generateToken(auth));
		       
		       

		        return new ResponseEntity<>(user, HttpStatus.OK);
		}
		
       @PostMapping("/api/user/purchase")
		public ResponseEntity<?> purchaseProduct(@RequestBody Transaction transaction){
	
	     transaction.setPurchaseDate(LocalDateTime.now());
	     return new ResponseEntity<>(transactionService.saveTransaction(transaction),HttpStatus.CREATED);
			
			
			
	}
       @GetMapping("/api/user/product")
       public ResponseEntity<?> getAllProducts(){
    	   return new ResponseEntity<>(productService.findAllProducts(),HttpStatus.OK);
       }
}


