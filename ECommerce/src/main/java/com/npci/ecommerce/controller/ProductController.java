package com.npci.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.service.IProductService;




@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@GetMapping("/showAll")
	public List<Product> findAllProduct() {
		return service.findAllProduct();
	}

	@GetMapping("/products/{productId}")
	public Product showById(@PathVariable int productId) throws Exception {
		Product product = service.findByProductId(productId);
		if (product == null) {
			throw new RuntimeException("Product ID : " + productId + " details not found ");
		}
		return product;
	}
	@PostMapping("/addNewProducts")
	public String saveProductDetails(@RequestBody Product product) {
		product.setProductId(0);
		service.saveProductDetails(product);
		return "Added Successfull";
	}
	@PutMapping("/updateProducts")
	public String updateProductDetails(@RequestBody Product product) {
		service.updateProductDetails(product);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		Product product = service.findByProductId(productId);
		if (product == null) {
			throw new RuntimeException("Product ID : " + productId + " details not found ");
		}
		service.deleteProductDetails(productId);
		return "Deleted Successfull";
	}
	
	

}
