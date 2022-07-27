package org.npci.ecommerce.service;

import java.util.List;

import org.npci.ecommerce.entity.Category;
import org.npci.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements CategoryService{

	@Autowired
	CategoryRepository catRepo;
	
	@Override
	public List<Category> findAllCat() {
		return catRepo.findAllCat();
	}

}
