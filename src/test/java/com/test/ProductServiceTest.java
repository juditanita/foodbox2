package com.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.entity.Product;
import com.service.ProductService;

public class ProductServiceTest {

  @Test
  public void addProductTest() {
   // throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getProductFromDtoTest() {
   // throw new RuntimeException("Test not implemented");
	  
	  ProductService ps= new ProductService();
	  @SuppressWarnings("static-access")
	 Product p =ps.getProductFromDto(null, null);
	  Assert.assertNotNull(p);
  }

  @Test
  public void listProductsTest() {
    //throw new RuntimeException("Test not implemented");
  }

  @Test
  public void updateProductTest() {
   // throw new RuntimeException("Test not implemented");
  }
}
