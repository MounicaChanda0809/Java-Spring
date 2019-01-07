package com.mtc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.app.dao.OrderDAOJdbc;
import com.mtc.app.dao.ProductDAOJdbc;
import com.mtc.app.vo.Order;
import com.mtc.app.vo.Product;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductDAOJdbc productDAOJdbc;
	
	@Autowired
	private OrderDAOJdbc orderDAOJdbc;

	@Override
	public boolean processOrder(Order order) {
		
		Product product = productDAOJdbc.findById(order.getProductId());
		
		if(order.getOrderQuantity() <= product.getQuantity()) {
			
			boolean flag = productDAOJdbc.updateQuantity(product.getId(),(product.getQuantity() - order.getOrderQuantity()));
			
			if(flag) {
				orderDAOJdbc.insertOrder(order.getId(), order.getProductId(), order.getOrderQuantity());
				System.out.println("Order Placed successfully");
				return true;
			}			
			
			
		}
		
		System.out.println("Order couldnt be placed..");
		
		return false;
	}

	@Override
	public void printProducts() {
		
		List<Product> products = productDAOJdbc.getProducts();
		
		products.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------");
		
	}
	
	@Override
	public void printOrders() {
		
		List<Order> orders = orderDAOJdbc.getOrders();
		
		orders.forEach(System.out::println);
		
	}

}
