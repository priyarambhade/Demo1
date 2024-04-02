package com.spring.boot.demo;

import org.apache.tomcat.util.codec.binary.Base64;

public class CharityTokenGenerator {

	public static String getBasicToken(String clientID, String clientSecrete) {
		String token = "Basic ";
		String data = clientID + ":" + clientSecrete;
		token += new String(Base64.encodeBase64(data.getBytes()));
		return token;
	}

	public static void main(String[] args) {
		String clientID = "d2de370dd90df0af";
		String clientSecrete = "fd2b88fe984bd2dd0ccd6f3f";
		System.out.println(getBasicToken(clientID, clientSecrete));
	}
}
