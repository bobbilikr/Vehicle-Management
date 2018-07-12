package com.coding.test.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.coding.test"})
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		return  new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
	}
	//Generate DDL
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter objJPA = new HibernateJpaVendorAdapter();
		objJPA.setDatabase(Database.H2);
		objJPA.setGenerateDdl(true);
		return objJPA;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean obj = new LocalContainerEntityManagerFactoryBean();
		obj.setDataSource(dataSource);
		obj.setJpaVendorAdapter(jpaVendorAdapter);
		obj.setPackagesToScan("com.coding.test.model");
		return obj;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory em) {
		return new JpaTransactionManager(em);
	}

}
