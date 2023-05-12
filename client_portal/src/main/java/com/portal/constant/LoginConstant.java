package com.portal.constant;

public interface LoginConstant {

	String LOGIN_VALI = "SELECT COUNT(*) FROM LOGIN WHERE USER_NAME = ? AND PWD = ? ";
}
