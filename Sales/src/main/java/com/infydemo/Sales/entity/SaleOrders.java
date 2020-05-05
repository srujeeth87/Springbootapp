package com.infydemo.Sales.entity;

import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name="Sales")
public class SaleOrders {
	@Id
	@GeneratedValue
	private int order_id ;
	private int store_id ;
	private Date order_date;
	private int order_quantity;
	private String order_status ;
	private Date shipped_date ;
	private String product_name;
	
	
	public SaleOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SaleOrders(int order_id, int store_id, Date order_date, int order_quantity, String order_status,
			Date shipped_date, String product_name) 
	{
		super();
		this.order_id = order_id;
		this.store_id = store_id;
		this.order_date = order_date;
		this.order_quantity = order_quantity;
		this.order_status = order_status;
		this.shipped_date = shipped_date;
		this.product_name = product_name;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getstore_id() {
		return store_id;
	}
	public void setstore_id(int store_id) {
		this.store_id = store_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Date getShipped_date() {
		return shipped_date;
	}
	public void setShipped_date(Date shipped_date) {
		this.shipped_date = shipped_date;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
		
}