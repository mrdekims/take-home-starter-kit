/******************************************************************************
 * Project Name     : com.bluespurs.starterkit.controller
 * Filename         : ProductController.java
 * Package          : com.bluespurs.starterkit.controller
 * Type             : ProductController
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluespurs.starterkit.domain.Product;
import com.bluespurs.starterkit.service.ProductService;


/**
 * The Class ProductController.
 */
@Controller
@RequestMapping(value = {"","/product"})
public class ProductController {

	/** The product service. */
	@Autowired
	private ProductService productService;
	
	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = {"/","index"})
	public String index(Model model){
		System.out.println(productService.findAll());
		model.addAttribute("products",productService.findAll());
		return "product/index";
	}

    /**
     * Creates the.
     *
     * @return the string
     */
    @RequestMapping(value = "create")
    public String create(){
        return "product/create";
    }	
	
    /**
     * Save.
     *
     * @param product the product
     * @return the string
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Product product){
        productService.save(product);
        return "redirect:index";
    } 	
    
    /**
     * Edits the.
     *
     * @param id the id
     * @param model the model
     * @return the string
     */
    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "product/edit";
    }      
    
    /**
     * Update.
     *
     * @param product the product
     * @return the string
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Product product){
        productService.save(product);
        return "redirect:index";
    }

    /**
     * Search.
     *
     * @param id the id
     * @param model the model
     * @return the product
     */
    @RequestMapping(value = "search/{id}")
    public  @ResponseBody Product search(@PathVariable Long id, Model model){
        return productService.findById(id);
    }    
    
    
}
