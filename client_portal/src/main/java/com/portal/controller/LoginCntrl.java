package com.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.svc.LoginSvcImpl;

@Controller
public class LoginCntrl {

	private static Logger log = LoggerFactory.getLogger(LoginCntrl.class);

	@Autowired
	LoginSvcImpl loginSvc;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

		return "login";
	}

	@RequestMapping(value = "/loginVali", method = RequestMethod.GET)
	public String loginVali(Model model, HttpServletRequest request, HttpServletResponse response) {
		String name = "xxx", pwd = "yyy";
		boolean flag = loginSvc.loginVali(name, pwd);

		if (flag)
			return "dashboard";

		return "login";
	}

}
