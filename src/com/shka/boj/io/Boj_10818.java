/*
 * problem
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * output
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 
 * result
 * 87996KB / 500ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			// 최대값 구하기
			if(num >= max) {
				max = num;
			}
			// 최소값 구하기
			if(num <= min) {
				min = num;
			}
		}
		System.out.println(min + " " + max);

		br.close();
	}
}
