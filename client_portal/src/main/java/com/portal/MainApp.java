package com.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.portal.common.PropertiesUtil;

@SpringBootApplication
@ComponentScan(basePackages = {"com.portal"})
public class MainApp {

	private static Logger log = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) {

		try {
			new PropertiesUtil().loadProperties();

			String contex = PropertiesUtil.getProperty("portal.contex");
			String port = PropertiesUtil.getProperty("portal.port");
			String webFolderPrefix = PropertiesUtil.getProperty("portal.web.folder.prefix");
			String webFolderSuffix = PropertiesUtil.getProperty("portal.web.folder.suffix");

			System.setProperty("server.servlet.context-path", contex);
			String strPort = System.getProperty("server.port");
			if (strPort == null || strPort.trim().length() == 0) {
				System.setProperty("server.port", port);
			}

			System.setProperty("spring.mvc.view.prefix", webFolderPrefix);
			System.setProperty("spring.mvc.view.suffix", webFolderSuffix);

			System.setProperty("spring.devtools.restart.enabled", "false");

			SpringApplication.run(MainApp.class, args);
			log.info("****** Spring App Started *****");
		} catch (Exception e) {
			log.error("Exception Occuered when Spring App Staring :: " + e);
		}

	}

}
