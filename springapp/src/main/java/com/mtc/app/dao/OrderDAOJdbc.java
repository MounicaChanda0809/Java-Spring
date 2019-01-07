package com.mtc.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mtc.app.dbsource.OrderDBStore;
import com.mtc.app.vo.Order;


@Repository("orderDAOJdbc")
public class OrderDAOJdbc {
	
	private OrderDBStore orderDBStore = new OrderDBStore();

	public void insertOrder(int id, int pid, int quantity) {
		
		orderDBStore.addOrder(id,pid,quantity);
		
	}
	
	
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderDBStore.getOrders();
	}
	
}
