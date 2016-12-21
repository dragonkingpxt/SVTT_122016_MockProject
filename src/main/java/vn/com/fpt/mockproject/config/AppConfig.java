package vn.com.fpt.mockproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("vn.com.fpt.mockproject.*") 
public class AppConfig {
	
	@Bean(name="viewResolver")
	public InternalResourceViewResolver getViewResolver(){
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	 @Bean(name = "multipartResolver")
	    public MultipartResolver getMultipartResolver() {
	        CommonsMultipartResolver resover = new CommonsMultipartResolver();
	        // 1MB
	        resover.setMaxUploadSize(1 * 1024 * 1024);
	 
	        return resover;
	    }
}
