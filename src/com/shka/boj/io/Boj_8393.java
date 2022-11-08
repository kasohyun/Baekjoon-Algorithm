/*
 * problem
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * output
 * 1부터 n까지 합을 출력한다.
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
