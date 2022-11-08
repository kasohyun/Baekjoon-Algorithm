/*
 * problem
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
 * ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 * output
 * ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
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
			
			// �ִ밪 ���ϱ�
			if(num >= max) {
				max = num;
			}
			// �ּҰ� ���ϱ�
			if(num <= min) {
				min = num;
			}
		}
		System.out.println(min + " " + max);

		br.close();
	}
}
