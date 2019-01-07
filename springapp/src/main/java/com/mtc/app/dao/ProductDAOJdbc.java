package com.mtc.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.dbsource.ProductDBStore;
import com.mtc.app.vo.Product;

@Repository("productDAOJdbc")
public class ProductDAOJdbc implements IProductDAO{

	@Autowired
	private ProductDBStore productDBStore;
	
	@Override
	public Product findById(int id) {
		
		List<Product> products = productDBStore.getProducts();
		
		for (Product product : products) {
			if(product.getId() == id) {
				return product;
			}
		}
		
		return null;
	}

	@Override
	public boolean updateQuantity(int productId, int quantity) {
		
		Product product = findById(productId);
		
		if(product != null) {
			product.setQuantity(quantity);
			return true;
		}
		
		return false;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productDBStore.getProducts();
	}

}
