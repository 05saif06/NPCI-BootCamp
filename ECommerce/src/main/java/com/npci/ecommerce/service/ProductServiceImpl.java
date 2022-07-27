package com.npci.ecommerce.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommerce.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("select e from Product e", Product.class);
		List<Product> productList = query.getResultList();
		return productList;
	}

	@Override
	public Product findByProductId(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	@Transactional
	public void saveProductDetails(Product product) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(product);

	}

	@Override
	public void updateProductDetails(Product product) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(product);

	}

	@Transactional
	public void deleteProductDetails(int productId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete  from Product  where id = :proId");
		query.setParameter("proId", productId);
		query.executeUpdate();

	}

}
