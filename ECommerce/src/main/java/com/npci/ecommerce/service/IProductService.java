package com.npci.ecommerce.service;

import java.util.List;

import com.npci.ecommerce.entity.Product;

public interface IProductService {

	public List<Product> findAllProduct(); // GET ALL

	public Product findByProductId(int id); // GET BY ID

	public void saveProductDetails(Product product); // POST NEW PRODUCT

	public void updateProductDetails(Product product); // PUT

	public void deleteProductDetails(int productId); // DELETE

}
