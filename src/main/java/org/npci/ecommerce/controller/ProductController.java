package org.npci.ecommerce.controller;

import java.util.List;

import org.npci.ecommerce.entity.Product;
import org.npci.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	ProductService prodServ;
	
	@GetMapping("/allprod")
	public List<Product> findallProd(){
		return prodServ.findAllProd();
	}
	
	@GetMapping("/prod/{prodId}")
	public Product findById(@PathVariable long prodId) {
		return prodServ.findByID(prodId);
	}
}
