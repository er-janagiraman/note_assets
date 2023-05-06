package com.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginCntrl {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

		return "login";
	}
	
	@RequestMapping(value = "/loginVali", method = RequestMethod.POST)
	public String loginVali(Model model, HttpServletRequest request, HttpServletResponse response) {

		return "dashboard";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String index(Model model, HttpServletRequest request, HttpServletResponse response) {

		return "login";
	}

}
