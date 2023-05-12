package com.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.svc.LoginSvcImpl;

@Controller
public class LoginCntrl {

	private static Logger log = LoggerFactory.getLogger(LoginCntrl.class);

	@Autowired(required = true)
	LoginSvcImpl loginSvc;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm() {
		return "login";
	}

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginVali(@RequestBody Map<String, String> jsonData) {
        String username = jsonData.get("username");
        String password = jsonData.get("password");
        boolean flag = loginSvc.loginVali(username, password);

        if (!flag) {
            // Invalid credentials, return error response
            Map<String, Object> response = new HashMap<>();
            response.put("success", false);
            response.put("message", "Invalid username or password");
            log.info("***** Invalid username or password *****");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }

        // Successful login, return success response
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        log.info("***** Login Success *****");
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "/dash", method = RequestMethod.GET)
    public String dash(Model model) {
        // Add any necessary logic or data to the model
        return "dashboard"; // Return the name of the view template for the dashboard
    }
}
