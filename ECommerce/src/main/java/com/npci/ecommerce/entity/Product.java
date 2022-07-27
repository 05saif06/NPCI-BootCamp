package com.npci.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer productId;
	@Column(name = "sku")
	private String stockKeepingUnit;
	@Column(name = "name")
	private String productName;
	@Column(name = "description")
	private String productDescription;
	@Column(name = "unitprice")
	private Integer unitPrice;
	@Column(name = "imageurl")
	private String imageUrl;
	@Column(name = "unitsinstock")
	private String unitsInStock;
	@Column(name = "datecreated")
	private String dateCreated;
	@Column(name = "lastupdated")
	private String lastUpdated;
	@Column(name = "categoryid")
	private Integer categoryId;

	public Product() {

	}

	public Product(Integer productId, String stockKeepingUnit, String productName, String productDescription,
			Integer unitPrice, String imageUrl, String unitsInStock, String dateCreated, String lastUpdated,
			Integer categoryId) {
		super();
		this.productId = productId;
		this.stockKeepingUnit = stockKeepingUnit;
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.categoryId = categoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getStockKeepingUnit() {
		return stockKeepingUnit;
	}

	public void setStockKeepingUnit(String stockKeepingUnit) {
		this.stockKeepingUnit = stockKeepingUnit;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(String unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", stockKeepingUnit=" + stockKeepingUnit + ", productName="
				+ productName + ", productDescription=" + productDescription + ", unitPrice=" + unitPrice
				+ ", imageUrl=" + imageUrl + ", unitsInStock=" + unitsInStock + ", dateCreated=" + dateCreated
				+ ", lastUpdated=" + lastUpdated + ", categoryId=" + categoryId + "]";
	}

}
