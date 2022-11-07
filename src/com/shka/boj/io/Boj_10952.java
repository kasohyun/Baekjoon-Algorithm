/*
 * problem
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 * �Է��� ���������� 0 �� ���� ���´�.
 * output
 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 * 
 * result
 * 14148KB/120ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if((A==0) && (B==0)) {
				break;
			}
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}
}
