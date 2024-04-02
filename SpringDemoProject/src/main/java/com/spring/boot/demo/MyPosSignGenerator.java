package com.spring.boot.demo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPosSignGenerator {

	@RequestMapping("/")
	public String generateSignature(HttpServletRequest request, HttpServletResponse response) {
		String signature = "";
		try {
			Map<String, String> parameterMap = new HashMap<>();
			parameterMap.put("branch_id", request.getParameter("branch_id"));
			parameterMap.put("channel", request.getParameter("channel"));
			parameterMap.put("config_id", request.getParameter("config_id"));
			parameterMap.put("grand_total", request.getParameter("grand_total") + "");
			parameterMap.put("qr_mode", request.getParameter("qr_mode"));
			parameterMap.put("random_str", request.getParameter("random_str"));
			parameterMap.put("reference_id", request.getParameter("reference_id"));
			parameterMap = sortMapByKey(parameterMap);

			String mapToString = convertHashMapToString(parameterMap);

			mapToString = mapToString + request.getParameter("clientId") + request.getParameter("token");

			mapToString = MD5(mapToString);

			signature = mapToString;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return signature;
	}
	
	
	public static String generateSignature1() {
		String signature = "";
		try {
			String clientId = "d2de370dd90df0af";
			String token ="10c9d452-639b-4e66-bbdf-4dc2ec24363a";
			Map<String, String> parameterMap = new HashMap<>();
//			 parameterMap.put("access_token", "82dadc71-a6ba-4a13-87dc-be63a75dc475");
		        parameterMap.put("branch_id", "196");
		        parameterMap.put("clientId", clientId);
		        parameterMap.put("clientSecreate", "fd2b88fe984bd2dd0ccd6f3f");
		        parameterMap.put("config_id", "209");
			parameterMap = sortMapByKey(parameterMap);

			String mapToString = convertHashMapToString(parameterMap);

			mapToString = mapToString + clientId + token;

			mapToString = MD5(mapToString);

			signature = mapToString;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return signature;
	}

	public static String convertHashMapToString(Map<String, String> paramMap) {
		String urlStr = "";
		if (paramMap != null && !paramMap.isEmpty()) {
			List keys = new ArrayList<>(paramMap.keySet());
			for (int i = 0; i < keys.size(); i++) {
				if (i == keys.size() - 1)
					urlStr += keys.get(i) + "=" + paramMap.get(keys.get(i));
				else
					urlStr += keys.get(i) + "=" + paramMap.get(keys.get(i)) + "&";
			}
		}
		return urlStr;
	}

	public static Map<String, String> sortMapByKey(Map<String, String> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});

		sortMap.putAll(map);

		return sortMap;
	}

	public static final String MD5(final String s) {
		final String MD5 = "MD5";
		try {
			// Create MD5 Hash
			MessageDigest digest = java.security.MessageDigest.getInstance(MD5);
			digest.update(s.getBytes());
			byte messageDigest[] = digest.digest();

			// Create Hex String
			StringBuilder hexString = new StringBuilder();
			for (byte aMessageDigest : messageDigest) {
				String h = Integer.toHexString(0xFF & aMessageDigest);
				while (h.length() < 2)
					h = "0" + h;
				hexString.append(h);
			}
			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println("sign-->"+generateSignature1());
	}
}
