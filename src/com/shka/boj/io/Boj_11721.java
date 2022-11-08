/*
 * problem
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
 * output
 * �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
 * 
 * result
 * 14372KB / 132ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str= br.readLine();
		int len = str.length();
		
		for(int i = 0; i < len/10; i++) {
			sb.append(str.substring(i*10, (i+1)*10) + "\n");
		}
		sb.append(str.substring((len/10)*10)+ "\n");
		
		System.out.println(sb);
		br.close();
	}
}
