/******************************************************************************
 * Project Name     : com.bluespurs.starterkit
 * Filename         : ServletInitializer.java
 * Package          : com.bluespurs.starterkit
 * Type             : ServletInitializer
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * The Class ServletInitializer.
 */
@SuppressWarnings("deprecation")
public class ServletInitializer extends SpringBootServletInitializer {
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationConfig.class);
	}
}
