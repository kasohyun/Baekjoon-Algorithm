/*
 * problem
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * output
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 
 * result
 * 18284KB / 216ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2742 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 0; i--) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
