/*
 * problem
 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * output
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
 * 
 * result
 * 18004KB / 220ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
