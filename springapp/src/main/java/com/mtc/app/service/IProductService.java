package com.mtc.app.service;

import com.mtc.app.vo.Order;

public interface IProductService {
	
	boolean processOrder(Order order);
	void printProducts();
	void printOrders();

}
