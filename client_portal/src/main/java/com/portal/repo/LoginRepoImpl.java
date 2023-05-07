package com.portal.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.portal.constant.LoginConstant;

public class LoginRepoImpl implements LoginRepo, LoginConstant {

	@Autowired
	@Qualifier(value = "userJdbcTemplate")
	JdbcTemplate userJdbcTemplate;

	private static Logger log = LoggerFactory.getLogger(LoginRepoImpl.class);

	@Override
	public boolean loginVali(String userName, String pwd) {
		boolean flag = false;
		try {

			int count = userJdbcTemplate.queryForObject(LOGIN_VALI, new Object[] { userName, pwd }, Integer.class);
			if (count > 0)
				flag = true;

		} catch (Exception e) {
			log.error("Exception Occured Login Valitation :: " + e);
		}
		return flag;
	}

}
