package com.func.common;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties properties = null;

	public static Properties getProperties() {
		return properties;
	}

	public static void setProperties(Properties properties) {
		PropertiesUtil.properties = properties;
	}

	public void loadProperties() throws Exception {
		properties = new Properties();
		InputStream input = null;
		try {
			input = getClass().getClassLoader().getResourceAsStream("config.dev.properties");
			getProperties().load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {
		String value = "";
		if (getProperties() == null) {
			try {
				new PropertiesUtil().loadProperties();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if ((getProperties() != null) && (getProperties().containsKey(key))) {
			value = getProperties().getProperty(key);
		}
		return value;
	}

}
