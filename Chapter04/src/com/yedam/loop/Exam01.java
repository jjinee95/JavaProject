package com.yedam.loop;

public class Exam01 {
	public static void main(String[] args) {
		int sum = 0;
		// 1) 규칙 
//		sum = sum + 1; // sum = 0 + 1 -> 1
//		sum = sum + 2; // sum = 1 + 2 -> 3
//		sum = sum + 3; // sum = 3 + 3 -> 6
//		sum = sum + 4; // sum = 6 + 4 -> 10
//		sum = sum + 5; // sum = 10 + 5 -> 15
		
		// 1~5까지의 합을 구하는 반복문
		
		for(int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		
		
		// 1~100 사이 짝수 구하는 반복문
		// 1) 규칙
		// 2 4 6 8 10..
		// i % 2 == 0
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //짝수
				System.out.println(i);
			}
		}
		

		// 1~100 사이 홀수
		
		for(int i = 100; i >= 1; i--) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		// 1~100 사이 2의 배수 또는 3의 배수 찾기 (or ||)
		// 2의 배수 i % 2 == 0
		// 3의 배수 i % 3 == 0
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.println(i + "는 2의 배수 또는 3의 배수입니다.");
			}
		}
		
		
		// 1~100 사이 2의 배수 이면서 3의 배수 찾기 (and &&) => 6의 배수
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + "는 2의 배수 이면서 3의 배수입니다.");
			}
		}
		
		
		// 구구단 2단 출력
		// 2*1, 2*2, 2*3, 2*4....2*9
		// 2*i
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2 * i));
		}
		
		
		// 중첩 for문 (for문 안에 for문
		// 초기화식에 들어가는 변수를 두개 고려
 		// 구구단 출력 (2~9단)
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		
		// 공포의 별 찍기
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
		// 한줄 만들기 -> 밑으로 한 칸 이동
		// 한칸씩 내려 갈 때 쓰는 반복문
//		for(int i = 0; i < 5; i++) {
//			String star = ""; // 스트링 데이터 비워주기
//			//별 만드는 반복문
//			for(int j = 0; j < 5; j++) {
//				// + 연산자 활용하여 비어있는 스트링에 * 만듦
//				star = star + "*";
//			}
//			System.out.println(star);
//		}
//		
		//*
		//**
		//***
		//****
		//*****
		
		//층 개수만큼 별 찍힘
		
//		for(int i = 0; i < 5; i++) {
//			String star = "";
//			for(int j = 0; i > j; j++) {
//				star = star + "*";
//			}
//			System.out.println(star);
//		}
		
		//*****
		//****
		//***
		//**
		//*
		for(int i = 1; i <= 5; i++) {
			String star = "";
			for(int j=5; j >= i; j--) {
				star = star + "*";
			}
			System.out.println(star);
		
		}
		
		for(int i=5; i>0; i--) {
			String star = "";
			for(int j=0; j<=5; j++) {
				if(j<i) {
				star = star + " ";
				}else if(j>=i){
					star = star + "*";
				}
			}
			System.out.println(star);	
		}
		
		
		
		
		
	}
}
