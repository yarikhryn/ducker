package org.h6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Class for mapping some resources paths to webapp folder
 *
 * @author sergiysi
 * @version v1.0
 */
@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");
        registry.addResourceHandler("/resources/**").addResourceLocations("/");
        registry.addResourceHandler("/pages/resources/**").addResourceLocations("/");
    }
}
