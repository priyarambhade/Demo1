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
		String clientID = "2e57ead8060bfc52";
		String clientSecrete = "15f5223fd652f33c26fd127f";
		System.out.println(getBasicToken(clientID, clientSecrete));
	}
}
