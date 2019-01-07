package com.mtc.app.dbsource;

import java.util.*;

import org.springframework.stereotype.Component;

import com.mtc.app.vo.Order;


@Component("orderDBStore")
public class OrderDBStore {
	
	List<Order> orders = new ArrayList<>();
	
	public void addOrder(int id, int pid, int quantity) {
		
		orders.add(new Order(id,pid,quantity));

		}
	
	public List<Order> getOrders() {
		return orders;
	}

}
