/*
 * problem
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * output
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 * 
 * result
 * substring : 14288KB / 128ms
 * read : 14392KB / 124ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*//substring이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number = 0;
		int result = 0;
		
		String numlist = br.readLine();
		for(int i = 0; i < N; i++) {
			number = Integer.parseInt(numlist.substring(i, i+1));
			result += number;
		}
		
		System.out.println(result);
		br.close();
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			result += br.read()-'0';
		}
		
		System.out.println(result);
		br.close();
	}
}
