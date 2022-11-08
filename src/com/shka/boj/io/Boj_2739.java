/*
 * problem
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 * input
 * ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
 * output
 * ������İ� ���� N*1���� N*9���� ����Ѵ�.
 * 
 * result
 * 14056KB / 124ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			sb.append(N).append(" * ").append(i).append(" = ").append(N*i).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
