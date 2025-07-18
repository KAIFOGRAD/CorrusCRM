package com.corrus.crm_service.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
            .setSkipNullEnabled(true)
            .setAmbiguityIgnored(true);
        return mapper;
    }

}