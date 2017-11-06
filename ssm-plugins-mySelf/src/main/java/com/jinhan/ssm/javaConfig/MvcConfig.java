package com.jinhan.ssm.javaConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;

@Configurable
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter{

	@Override  
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
        configurer.enable();  
    }  
  
    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/")  
            .resourceChain(false)  
                .addResolver(new WebJarsResourceResolver())  
                .addResolver(new PathResourceResolver());  
    }  

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	
    }
	
}
