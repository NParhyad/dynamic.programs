package com.tintin.dynamic.programs;

import java.util.Scanner;

public class FiboTopDownApproach {

	private static Scanner sc;

	private static int count;

	public static void main(String[] args) {
		FiboTopDownApproach obj = new FiboTopDownApproach();
		System.out.println("Enter the no: ");
		sc = new Scanner(System.in);
		int no = sc.nextInt();
		int value = obj.fibo(no);
		System.out.println(value);
		System.out.println(count);

	}

	// i/p - 0 1 2 3 4 5 6
	// o/p - 0 1 1 2 3 5 8
	private int fibo(int n) {
		count++;
		int sum = 0;
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			sum = fibo(n - 1) + fibo(n - 2);
		}

		return sum;
	}

}
