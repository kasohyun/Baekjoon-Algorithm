/*
 * problem
 * �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
 * �� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
 * output
 * �Է¹��� �״�� ����Ѵ�.
 * 
 * result
 * 14314KB / 128ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11719 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
