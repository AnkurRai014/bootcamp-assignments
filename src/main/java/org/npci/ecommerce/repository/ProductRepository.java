package org.npci.ecommerce.repository;

import java.util.List;

import org.npci.ecommerce.entity.Product;

public interface ProductRepository {

	public List<Product> findAllProd();
	public Product findByID(long prodId);
}
