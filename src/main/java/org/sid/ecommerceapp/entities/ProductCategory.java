package org.sid.ecommerceapp.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "product_category")
public class ProductCategory {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(mappedBy = "product_category" ,cascade = CascadeType.ALL)
    private Collection<Product> products;


}
