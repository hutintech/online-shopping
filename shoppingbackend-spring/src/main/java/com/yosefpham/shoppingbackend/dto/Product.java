package com.yosefpham.shoppingbackend.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Product {
	
		// private fields
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String code;
		private String name;
		private String brand;
		private String description;
		@Column(name = "unit_price")
		private double unitPrice;
		private int quantity;
		@Column(name = "is_active")	
		@JsonIgnore
		private boolean active;
		@Column(name = "category_id")
		@JsonIgnore
		private int categoryId;
		@Column(name = "supplier_id")
		@JsonIgnore
		private int supplierId;
		private int purchases;
		private int views;
		
		// default constructor
		public Product() {
			
			this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
			
		}
		
		
		// setters and getters
		public int getId() {
			return id;
		}
		public String getCode() {
			return code;
		}
		public String getName() {
			return name;
		}
		public String getBrand() {
			return brand;
		}
		public String getDescription() {
			return description;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public boolean isActive() {
			return active;
		}
		public int getCategoryId() {
			return categoryId;
		}
		public int getSupplierId() {
			return supplierId;
		}
		public int getPurchases() {
			return purchases;
		}
		public int getViews() {
			return views;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		public void setSupplierId(int supplierId) {
			this.supplierId = supplierId;
		}
		public void setPurchases(int purchases) {
			this.purchases = purchases;
		}
		public void setViews(int views) {
			this.views = views;
		}

}
