package com.coding.test.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.coding.test"})
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		return  new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
	}

}
