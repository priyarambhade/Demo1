package com.spring.boot.demo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("Enter Your input");
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		System.out.println("Input -->" + inp);

		switch (inp) {
		case "mamal":
			System.out.println("You select mamal");
			break;

		default:
			System.out.println("Invalid Result");
			break;
		}
	}

}
