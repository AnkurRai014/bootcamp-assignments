package org.npci.ecommerce.repository;

import java.util.List;

import org.npci.ecommerce.entity.Category;

public interface CategoryRepository {

	public List<Category> findAllCat();
}
