package org.npci.ecommercerestapinew.repository;

import org.npci.ecommercerestapinew.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "category")
@CrossOrigin("http://localhost:4200/")
public interface CategoryDao extends JpaRepository<Category, Integer> {

}