package org.sid.ecommerceapp.dao;

import org.sid.ecommerceapp.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")
public interface productCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
