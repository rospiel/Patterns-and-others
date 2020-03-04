package com.patterns.patternsandothers.config;

import com.patterns.patternsandothers.factory.HerbsFactory;
import com.patterns.patternsandothers.interfaces.Herbs;
import com.patterns.patternsandothers.models.Cinnamon;
import com.patterns.patternsandothers.models.Ginger;
import com.patterns.patternsandothers.models.Peppermint;
import com.patterns.patternsandothers.models.Turmeric;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HerbsConfig {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
        serviceLocatorFactoryBean.setServiceLocatorInterface(HerbsFactory.class);
        return serviceLocatorFactoryBean;
    }

    @Bean
    public Herbs ginger() {
        return new Ginger();
    }

    @Bean
    public Herbs cinnamon() {
        return new Cinnamon();
    }

    @Bean
    public Herbs peppermint() {
        return new Peppermint();
    }

    @Bean
    public Herbs turmeric() {
        return new Turmeric();
    }
}
