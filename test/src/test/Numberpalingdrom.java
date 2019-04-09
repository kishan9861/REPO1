package test;

import java.util.Scanner;

public class Numberpalingdrom {
	public static int numberpalingdrom(int a) {

		int sum = 0;
		int temp = a;
		while (a > 0) {
			
			
			int rem = a % 10;
			sum = (sum * 10) + rem;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("number is palingdrom :" + sum);
		} else {
			System.out.println("number is not palingdrom :" + temp);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		numberpalingdrom(a);

	}

}
