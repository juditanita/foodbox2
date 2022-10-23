package com.test;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.entity.Category;
import com.service.CategoryService;


public class CategoryServiceTest {

  @Test
  public void createCategoryTest() {
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void listCategoriesTest() {
    //throw new RuntimeException("Test not implemented");
	  CategoryService cs= new CategoryService();
	  
	 List<Category> c  = cs.listCategories();
	  Assert.assertNotNull(c);
  }
  

  @Test
  public void readCategoryTestString() {
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void readCategoryTestInteger() {
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void updateCategoryTest() {
    throw new RuntimeException("Test not implemented");
  }
}
