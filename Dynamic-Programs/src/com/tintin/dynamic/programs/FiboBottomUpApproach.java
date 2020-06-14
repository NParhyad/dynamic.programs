package com.tintin.dynamic.programs;

import java.util.Scanner;

public class FiboBottomUpApproach {

	private static Scanner sc;

	public static void main(String[] args) {
		FiboBottomUpApproach obj = new FiboBottomUpApproach();
		System.out.println("Enter the no: ");
		sc = new Scanner(System.in);
		int no = sc.nextInt();
		int value = obj.fibo(no);
		System.out.println(value);

	}

	// i/p - 0 1 2 3 4 5 6
	// o/p - 0 1 1 2 3 5 8
	private int fibo(int n) {

		int no[] = new int[n+1];
		no[0] = 0;
		no[1] = 1;

		for (int i = 2; i <= n; i++) {
			no[i] = no[i - 1] + no[i - 2];
		}
		return no[n];
	}

}
