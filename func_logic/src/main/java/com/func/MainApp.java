package com.func;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.func.common.PropertiesUtil;

@ComponentScan("com")
@SpringBootApplication
public class MainApp {

	private static Logger log = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) {

		try {
			new PropertiesUtil().loadProperties();
			System.setProperty("spring.devtools.restart.enabled", "false");
			SpringApplication.run(MainApp.class, args);
			log.info("****** Spring App Started *****");
		} catch (Exception e) {
			log.error("Exception Occuered when Spring App Staring :: " + e);
		}

	}

}
