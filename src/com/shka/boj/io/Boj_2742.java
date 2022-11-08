/*
 * problem
 * �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 * output
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
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
