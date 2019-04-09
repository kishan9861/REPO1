package test;

import java.util.Scanner;

public class StringPalingDrom {
	public static String stringpalingdrom(String x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String value: ");
		String ss = sc.nextLine();
		char[] ch = ss.toCharArray();
		int length = ch.length;
		String sp = "";
		for (int i = length-1; i >= 0; i--) {
			sp = sp + ss.charAt(i);
		}
		if (ss.equalsIgnoreCase(sp)) {
			System.out.println("palingdrom" + sp);
		} else {
			System.out.println("not palinngdrom" + sp);
		}

		return sp;

	}

	public static void main(String[] args) {

		stringpalingdrom("madam");

	}

}
