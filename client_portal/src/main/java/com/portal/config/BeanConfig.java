package com.portal.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanConfig {

	@Bean
	@Qualifier("userDataSource")
	public DataSource postgresDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://192.168.1.40:5432/notes_assets?currentSchema=user_dtls");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean
	@Qualifier("userJdbcTemplate")
	public JdbcTemplate postgresJdbcTemplate(@Qualifier("userDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
