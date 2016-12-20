/******************************************************************************
 * Project Name     : com.bluespurs.starterkit.config
 * Filename         : AppConfiguration.java
 * Package          : com.bluespurs.starterkit.config
 * Type             : AppConfiguration
 * Revision History :   
 *  
 * @author Michael.Dalisay
 ******************************************************************************/
package com.bluespurs.starterkit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * The Class AppConfiguration.
 */
@Configuration
public class AppConfiguration extends WebMvcConfigurerAdapter{

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * View resolver.
     *
     * @return the internal resource view resolver
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }	
	
}
