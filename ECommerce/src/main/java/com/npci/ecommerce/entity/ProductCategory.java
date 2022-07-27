package com.npci.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory {
	@Id
	@Column(name = "categoryid")
	private Integer categoryId;
	@Column(name = "categoryname")
	private String categoryName;

	public ProductCategory() {

	}

	public ProductCategory(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}
