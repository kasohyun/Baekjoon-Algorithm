/*
 * problem
 * N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �־�����. �� ���� ������ 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * output
 * ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * result
 * 335012KB/2688ms
 * 
 * Copyright 2022. kasohyun all rights reserved. 
 */

package com.shka.boj.sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_2751 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int number = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {
			list.add(in.nextInt());
			//numlist[i] = in.nextInt();
		}
		
		Collections.sort(list);
		
		for(int result : list) {
			sb.append(result).append('\n');
			//System.out.println(result);
		}
		System.out.println(sb);

	}

}
