package com.portal.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.repo.LoginRepo;

@Service
public class LoginSvcImpl implements LoginSvc {

	@Autowired
	LoginRepo loginRepo;
	
	private static Logger log = LoggerFactory.getLogger(LoginSvcImpl.class);

	@Override
	public boolean loginVali(String userName, String pwd) {
		return loginRepo.loginVali(userName, pwd);
	}

}
