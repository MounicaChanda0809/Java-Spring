package com.mtc.app.vo;

public class Order {
	
	private int id;
	private int productId;
	private int orderQuantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Order(int id, int productId, int orderQuantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.orderQuantity = orderQuantity;
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

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + orderQuantity;
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		if (orderQuantity != other.orderQuantity)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", productId=" + productId + ", orderQuantity=" + orderQuantity + "]";
	}
	
	

}
