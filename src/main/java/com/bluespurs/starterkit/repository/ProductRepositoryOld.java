package com.bluespurs.starterkit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bluespurs.starterkit.domain.Product;

@Repository
public interface ProductRepositoryOld extends CrudRepository<Product,Long>{
}
