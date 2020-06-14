package com.tintin.dynamic.programs;

import java.util.Scanner;

public class FiboTopDownApproachOptimized {

	private static Scanner sc;

	private static int count;

	private int fiboNos[];

	public static void main(String[] args) {
		FiboTopDownApproachOptimized obj = new FiboTopDownApproachOptimized();
		System.out.println("Enter the no: ");
		sc = new Scanner(System.in);
		int no = sc.nextInt();
		obj.fiboNos = new int[no+2];
		obj.resetFiboNos();
		obj.fiboNos[0] = 0;
		obj.fiboNos[1] = 1;
		int value = obj.fibo(no);
		System.out.println(value);
		//count reduced i.e Time complexity has been reduced 
		System.out.println(count);

	}

	public void resetFiboNos() {
		for (int i = 0; i < fiboNos.length; i++) {
			fiboNos[i] = -1;
		}
	}

	// i/p - 0 1 2 3 4 5 6
	// o/p - 0 1 1 2 3 5 8
	private int fibo(int n) {
		count++;
		int sum = 0;
		if (n < 0) {
			return -1;
		} 
		if (fiboNos[n] != -1) {
			return fiboNos[n];
		}
		else {
			sum = fibo(n - 1) + fibo(n - 2);
			fiboNos[n] = sum;
		}
		return sum;
	}

}
