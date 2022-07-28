package com.npci.thymeleaf.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.npci.thymeleaf.product.entity.Product;

public interface ProductDAO extends JpaRepository<Product,Integer>{
	
	public List<Product>
	findByProductNameContains(String name);

}
