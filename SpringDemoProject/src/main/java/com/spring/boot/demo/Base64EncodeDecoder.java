package com.spring.boot.demo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EncodeDecoder {

	public static String decodeBase64(String eStr) {

		// Getting MIME decoder
		Base64.Decoder decoder = Base64.getMimeDecoder();
		// Decoding MIME encoded message
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded message: " + dStr);
		return dStr;
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		String inp = "912092XXXXXX1183";
		Base64EncodeDecoder.decodeBase64(inp);
		System.out.println("card number ==>"+(912092 % 1000000));
		
//		String s1 = "E8wSYn4RqDJmnFvjsI4C97ipTjLfCB8mOoSnHSoyprI6rDarzPCPRgTCb/XD4UdegqiXdvCROPYIXZ5R1yI/vFXXYLxzOV1x4rjG83+lvt/zJD/bQ1ka2ZcFJiQz0ee5woyEnaq6FgUUGtCP5S0FiOzuhWObBXjlkoulJUhPgo37WIxTW52Vb/IUIK1IL/WFNvie/XsrNjrsr+ZiCXGfvcdWsOMNtfuUXUU8+L0h1CMgd2Rv01Cedt/j+4XfrTF9n8vzaPlIyV3EoVnb6aFoFRZtyAbmiTaflGjPLp7Bc4C48U8LMepOyrP9+TYRU1naFxuv5aD/MRWsMnKMDq3RVQ==";
//		byte[] bytes = s1.getBytes("UTF-8");
//		String s2 = new String(bytes, "UTF-8");
//		System.out.println("Data=>"+s2);
	}

}
