package com.portal.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class BeanConfig {

	@Autowired
	@Qualifier("adminDataSource")
	private DataSource adminDataSource;

	@Autowired
	@Qualifier("userDataSource")
	private DataSource userDataSource;

	@Bean(name = "adminJdbcTemplate")
	public JdbcTemplate adminJdbcTemplate() {
		return new JdbcTemplate(adminDataSource);
	}

	@Bean(name = "userJdbcTemplate")
	public JdbcTemplate userJdbcTemplate() {
		return new JdbcTemplate(userDataSource);
	}

}
