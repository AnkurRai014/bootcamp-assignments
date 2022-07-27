package org.npci.ecommerce.service;

import java.util.List;

import org.npci.ecommerce.entity.Product;
import org.npci.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	ProductRepository prodRepo;
	
	@Override
	public List<Product> findAllProd() {
		return prodRepo.findAllProd();
	}

	@Override
	public Product findByID(long prodId) {
		return prodRepo.findByID(prodId);
	}
	

}
