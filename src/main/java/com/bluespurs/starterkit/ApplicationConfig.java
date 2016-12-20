/******************************************************************************
 * Project Name     : com.bluespurs.starterkit
 * Filename         : ApplicationConfig.java
 * Package          : com.bluespurs.starterkit
 * Type             : ApplicationConfig
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;


/**
 * The Class ApplicationConfig.
 */
@SpringBootApplication
@EnableCaching

public class ApplicationConfig extends SpringBootServletInitializer {
	
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }	
}
