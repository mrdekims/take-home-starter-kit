/******************************************************************************
 * Project Name     : com.bluespurs.starterkit.repository
 * Filename         : ProductRepository.java
 * Package          : com.bluespurs.starterkit.repository
 * Type             : ProductRepository
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.bluespurs.starterkit.domain.Product;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * The Interface ProductRepository.
 */
@RepositoryRestResource(collectionResourceRel = "products", path="products")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{
	
	/**
	 * Find by product name.
	 *
	 * @param productName the product name
	 * @return the list
	 */
	List<Product> findByProductName(@Param("productName") String productName);
}

