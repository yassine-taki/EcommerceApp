package org.sid.ecommerceapp.dao;

import org.sid.ecommerceapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface productRepository extends JpaRepository<Product,Long> {
}
