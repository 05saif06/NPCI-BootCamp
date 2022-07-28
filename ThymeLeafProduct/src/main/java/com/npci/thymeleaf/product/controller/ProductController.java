package com.npci.thymeleaf.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.npci.thymeleaf.product.entity.Product;
import com.npci.thymeleaf.product.service.IProductService;

@Controller
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private IProductService service;

	@GetMapping("/productList")
	public String findAll(Model model) {
		List<Product> product = service.findAllProduct();
		model.addAttribute("PRODUCT", product);
		return "productUI/product.html";
	}

	@GetMapping("/addProduct")
	public String productForm(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "productUI/productForm.html";
	}

	@PostMapping("/saveProduct")
	public String saveProductDetails(@ModelAttribute("PRODUCT") Product product) {
		service.saveProductDetails(product);
		return "redirect:/api/productList";
	}

	@GetMapping("/updateForm")
	public String updateProductDetails(@RequestParam("productId") int productId, Model model) {
		Product product = service.findById(productId);
		model.addAttribute("PRODUCT", product);
		return "productUI/product.html";
	}

	@GetMapping("/deleteForm")
	public String deleteById(@RequestParam("productId") int productId) {
		service.deleteById(productId);
		return "redirect:/api/productList";
	}
	
	@GetMapping("/search")
	public String searchProduct(@RequestParam("productName") String productName, Model model) {
		List<Product> product = service.searchBy(productName);
		model.addAttribute("PRODUCT", product);
		return "redirect:/api/productList";
	}
	
	

}
