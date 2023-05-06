package com.portal.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginRepoImpl implements LoginRepo {

	@Autowired
    @Qualifier("userDataSource")
    private JdbcTemplate userDataSource;
	
	@Autowired
    @Qualifier("adminDataSource")
    private JdbcTemplate adminDataSource;
	
	
}
