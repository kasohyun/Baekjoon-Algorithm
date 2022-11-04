/*
 * problem
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
 * output
 * ù° �ٿ� A+B�� ����Ѵ�.
 * 
 * result
 * 14196KB/128ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2558 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()); 
		int B = Integer.parseInt(br.readLine());
		
		if(A > 0 && B < 10) {
			System.out.println(A+B);
		}

	}

}
