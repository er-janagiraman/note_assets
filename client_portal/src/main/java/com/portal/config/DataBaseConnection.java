package com.portal.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;

import com.portal.common.PropertiesUtil;

public class DataBaseConnection {

	static String adminUrl = PropertiesUtil.getProperty("spring.datasource.admin.url");
	static String adminUsername = PropertiesUtil.getProperty("spring.datasource.admin.username");
	static String adminPwd = PropertiesUtil.getProperty("spring.datasource.admin.password");

	static String userUrl = PropertiesUtil.getProperty("spring.datasource.user.url");
	static String userUsername = PropertiesUtil.getProperty("spring.datasource.user.username");
	static String userPwd = PropertiesUtil.getProperty("spring.datasource.user.password");

	@Bean(name = "adminDataSource")
	public DataSource adminDataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl(adminUrl);
		dataSource.setUsername(adminUsername);
		dataSource.setPassword(adminPwd);
		return dataSource;
	}

	@Bean(name = "userDataSource")
	public DataSource userDataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl(userUrl);
		dataSource.setUsername(userUsername);
		dataSource.setPassword(userPwd);
		return dataSource;
	}

}
