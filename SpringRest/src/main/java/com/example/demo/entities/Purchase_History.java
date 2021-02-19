package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Purchase_History")
public class Purchase_History {
	/**
	* 
	*/
	// Variable Declaration
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@Column(name = "Billing_ID")
	private int billingId;
	@Column(name = "Product_ID")
	private int productId;
	@Column(name = "Product_Name")
	private String product_Name;
	@Column(name = "Product_Cost")
	private float product_cost;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Total_Cost")
	private float total_cost;

	// Non-Parameterized constructor
	public Purchase_History() {
		super();

	}

	/**
	 * parameterized constructor
	 * 
	 * @param id
	 * @param billingId
	 * @param productId
	 * @param product_Name
	 * @param product_cost
	 * @param quantity
	 * @param total_cost
	 */
	public Purchase_History(int id, int billingId, int productId, String product_Name, float product_cost,
			int quantity, float total_cost) {
		super();
		this.id = id;
		this.billingId = billingId;
		this.productId = productId;
		this.product_Name = product_Name;
		this.product_cost = product_cost;
		this.quantity = quantity;
		this.total_cost = total_cost;
	}

	/**
	 * <p>
	 * Getters and Setters
	 * </p>
	 */
	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(float product_cost) {
		this.product_cost = product_cost;
	}

	public float getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(float total_cost) {
		this.total_cost = total_cost;
	}

	public Object getQuantity() {
		return quantity;
	}

	public void setQuantity(int object) {
		this.quantity = object;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	

	
	// Product Description
	@Override
	public String toString() {
		return "Purchase_History [id=" + id + ", billingId=" + billingId + ", productId=" + productId
				+ ", product_Name=" + product_Name + ", product_cost=" + product_cost + ", quantity=" + quantity
				+ ", total_cost=" + total_cost + "]";
	}

}
