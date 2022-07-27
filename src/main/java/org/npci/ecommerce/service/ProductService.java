package org.npci.ecommerce.service;

import java.util.List;

import org.npci.ecommerce.entity.Product;

public interface ProductService {

	public List<Product> findAllProd();
	public Product findByID(long prodId);
}
