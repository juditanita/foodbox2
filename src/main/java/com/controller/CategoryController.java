package com.controller;


import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.ApplicationConfig;
import com.entity.Category;
import com.service.CategoryService;


@RestController
@RequestMapping("/category")

public class CategoryController {


    @Autowired
	private CategoryService catServ;
    
    @PostMapping("/create")
	public ResponseEntity<ApplicationConfig> createCategory(@Valid @RequestBody Category category) {
		if (Objects.nonNull(catServ.readCategory(category.getName()))) {
			return new ResponseEntity<ApplicationConfig>(new ApplicationConfig(false, "category already exists"), HttpStatus.CONFLICT);
		}
		catServ.createCategory(category);
		return new ResponseEntity<>(new ApplicationConfig(true, "created the category"), HttpStatus.CREATED);
	}

    

     @GetMapping("/")
	public ResponseEntity<List<Category>> getCategories() {
		List<Category> body = catServ.listCategories();
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
     
     
     @PostMapping("/update/{categoryID}")
 	public ResponseEntity<ApplicationConfig> updateCategory(@PathVariable("categoryID") Integer categoryID, @Valid @RequestBody Category category) {
 		// Check to see if the category exists.
 		if (Objects.nonNull(catServ.readCategory(categoryID))) {
 			// If the category exists then update it.
 			catServ.updateCategory(categoryID, category);
 			return new ResponseEntity<ApplicationConfig>(new ApplicationConfig(true, "updated the category"), HttpStatus.OK);
 		}

 		// If the category doesn't exist then return a response of unsuccessful.
 		return new ResponseEntity<>(new ApplicationConfig(false, "category does not exist"), HttpStatus.NOT_FOUND);
 	}
}