package com.universalyazilim.universalodev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 *
 * @author Ahmad
 */
@EnableWebMvc
@Configuration
@ComponentScan({ "com.universalyazilim.universalodev.*" })
@Import({ SecurityConfig.class })
public class ThymeleafConfiguration {

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver cltr = new ClassLoaderTemplateResolver();
        cltr.setPrefix("/templates/pages");
        cltr.setSuffix(".html");
        cltr.setCharacterEncoding("UTF-8");
        cltr.setOrder(0);

        return cltr;
    }

}
