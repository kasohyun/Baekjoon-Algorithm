/*
 * problem
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * output
 * 첫째 줄에 A+B를 출력한다.
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
