package org.npci.ecommerce.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.npci.ecommerce.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepositoryImp implements CategoryRepository{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Category> findAllCat() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<Category> query = currSession.createQuery("select e from Category e", Category.class);
		
		List<Category> catList = query.getResultList();
		return catList;
	}

}
