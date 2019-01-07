package com.mtc.app.dao;

import java.util.List;

import com.mtc.app.vo.Product;

public interface IProductDAO {
	
	Product findById(int id);
	boolean updateQuantity(int productId,int quantity);
	List<Product> getProducts();


}
