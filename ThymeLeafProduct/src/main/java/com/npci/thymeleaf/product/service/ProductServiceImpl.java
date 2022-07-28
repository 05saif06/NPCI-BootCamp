package com.npci.thymeleaf.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.thymeleaf.product.entity.Product;
import com.npci.thymeleaf.product.repository.ProductDAO;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public List<Product> findAllProduct() {
		return dao.findAll();
	}

	@Override
	public void saveProductDetails(Product product) {
		dao.save(product);

	}

	@Transactional
	public Product findById(int productId) {
		Optional<Product> result = dao.findById(productId);
		Product product = null;
		if (result.isPresent()) {
			product = result.get();
		}
		return product;
	}

	@Transactional
	public void deleteById(int productId) {
		dao.deleteById(productId);

	}

	@Override
	public List<Product> searchBy(String productName) {
		// TODO Auto-generated method stub
		List<Product> result = null;
		if(productName != null && (productName.trim().length() > 0)) {
			dao.findByProductNameContains(productName);
		}
		else {
			result = findAllProduct();
		}
		return result;
	}

}
