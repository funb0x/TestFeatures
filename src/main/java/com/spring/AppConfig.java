package com.spring;

import com.spring.service.Service;
import com.spring.service.impl.ServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public Service service() {
        return new ServiceImpl();
    }

}
