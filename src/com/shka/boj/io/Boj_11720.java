/*
 * problem
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 * output
 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
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
		
		/*//substring�̿�
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
