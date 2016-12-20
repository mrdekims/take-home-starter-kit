/******************************************************************************
 * Project Name     : com.bluespurs.starterkit.domain
 * Filename         : Product.java
 * Package          : com.bluespurs.starterkit.domain
 * Type             : Product
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The Class Product.
 */
@Entity
@Table(name = "Product")
public class Product {

	/** The id. */
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	/** The product name. */
	@Column(name = "productName")
	private String productName;
	
	/** The best price. */
	@Column(name = "bestPrice")
	private float bestPrice;
	
	/** The currency. */
	@Column(name = "currency")
	private String currency;
	
	/** The location. */
	@Column(name = "location")
	private String location;
	
	/**
	 * Instantiates a new product.
	 */
	public Product(){
	}
	
	/**
	 * Instantiates a new product.
	 *
	 * @param id the id
	 * @param productName the product name
	 * @param bestPrice the best price
	 * @param currency the currency
	 * @param location the location
	 */
	public Product(long id, String productName, float bestPrice, String currency, String location){
		this.id = id;
		this.productName = productName;
		this.bestPrice = bestPrice;
		this.currency = currency;
		this.location = location;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * Gets the best price.
	 *
	 * @return the best price
	 */
	public float getBestPrice() {
		return bestPrice;
	}

	/**
	 * Sets the best price.
	 *
	 * @param bestPrice the new best price
	 */
	public void setBestPrice(float bestPrice) {
		this.bestPrice = bestPrice;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return this.productName;
	}

	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
	
	
	
}
