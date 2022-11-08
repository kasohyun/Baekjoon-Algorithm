/*
 * problem
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
 * output
 * 1���� n���� ���� ����Ѵ�.
 * 
 * result
 * 14180KB / 120ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);

		br.close();
	}
}
