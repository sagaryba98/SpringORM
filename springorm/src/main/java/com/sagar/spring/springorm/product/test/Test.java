package com.sagar.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sagar.spring.springorm.product.dao.ProductDao;
import com.sagar.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springorm/product/test/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDao");
//		Product product=new Product();
//		product.setId(101);
//		product.setName("AppleIphone");
//		product.setDisc("Apple Iphone 11 pro max");
//		product.setPrice(1499);
		// productdao.create(product);
		// productdao.update(product);
		// productdao.delete(product);
//		Product find = productdao.find(1);
//		Product find2 = productdao.find(1);
//		System.out.println(find);
//		System.out.println(find2);
		
		List<Product> findAll = productdao.findAll();//finding all product
		System.out.println(findAll);

	}

}
