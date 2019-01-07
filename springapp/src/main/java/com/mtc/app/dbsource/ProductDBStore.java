package com.mtc.app.dbsource;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtc.app.vo.Product;

@Component("productDBStore")
public class ProductDBStore {
	
	//@Autowired
	ArrayList<Product> products;
	
	@PostConstruct
	public void initProductDBStore() {
		
		products = new ArrayList<>();

                               //id   name  price description quantity
		products.add(new Product(101,"PROD1",20,"PROD1 Description", 40));
		products.add(new Product(102,"PROD2",30,"PROD2 Description", 50));
		products.add(new Product(103,"PROD3",50,"PROD3 Description", 100));
		products.add(new Product(104,"PROD4",25,"PROD4 Description", 400));
		
	}
	
	public List<Product> getProducts() {
		return products;
	}

}
