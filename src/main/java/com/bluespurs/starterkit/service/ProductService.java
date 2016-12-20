package com.bluespurs.starterkit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bluespurs.starterkit.dao.ProductDAO;
import com.bluespurs.starterkit.domain.Product;
import com.bluespurs.starterkit.repository.ProductRepositoryOld;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private ProductRepositoryOld productRepository;
	
	public Object findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id){
		return productRepository.findOne(id);
	}
	
	public Product save(Product product){
		return productRepository.save(product);
	}
	
	
}
