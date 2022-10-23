package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Category;
import com.repo.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository caterepo;
	

	
	public  Category readCategory(String name) {
		return caterepo.findByName(name);
	}
	public  void createCategory(Category category) {
		caterepo.save(category);
	}
	public List<Category> listCategories() {
		return caterepo.findAll();
	}
	
	public Optional<Category> readCategory(Integer categoryID) {
		return caterepo.findById(categoryID);
	}

	public void updateCategory(Integer categoryID, Category newCategory) {
		Category category = caterepo.findById(categoryID).get();
		category.setName(newCategory.getName());
		caterepo.save(category);
		
		
	}
}



