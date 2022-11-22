package com.yedam.operator;

public class Exam01 {
	public static void main(String[] args) {
		
		//부호 연산자 + -
		int x = -100;
		int result1 = -x;
		int result2 = +x;
		System.out.println("result1 : " + result1);
		System.out.println("result1 : " + result2);
				
		byte b = 100;
		//byte result3 = -b -> 오류. 인트타입에 넣어야
		int result = -b;
		
		
		// 증감 연산자 ++, --
		// 위치에 따라서 연산 타이밍이 다름.
		int value = 100;
		
		// 출력문이 실행되고 나서 value 값 1 증가
		System.out.println(value++); // 구문 다 실행 후(내려간 후) +1
		
		// 출력문이 실행되기 전 value 값 1 증가
		System.out.println(++value); // 콘솔창 출력 되기 전(내려옴과 동시에) +1. 101 + 1
		
		
		// 논리 부정 연산자 (not)
		// true + not(!) = false
		boolean flag = true;
		
		if(!flag) { //명제 false 실행안됨
			System.out.println("false");
		}
		if(flag) {
			System.out.println("true");
		}
		
		// false + not(!) = true
		boolean flag2 = false;
		
		if(!flag2) { //명제 false 실행안됨
			System.out.println("false");
		}
		if(flag2) {
			System.out.println("true");
		}
		
		
		
		// 이항 연산자 (사칙연산)
		int v1 = 10;
		int v2 = 4;
		
		System.out.println(v1 + v2); // +
		System.out.println(v1 - v2); // -
		System.out.println(v1 * v2); // *
		
		// 나누기 2개가 존재 목/, 나머지%
		System.out.println("/ : " + (v1 / v2));
		System.out.println("% : " + (v1 % v2));
		
		
		// 문자열 결합 연산자(+), 딱풀연산자
		System.out.println("자바" + "jdk" + "11버전");
		
		
		// 비교 연산자
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2); //T
		System.out.println(num1 != num2); //F
		System.out.println(num1 >= num2); //T
		
		char char1 = 'A';  //65
		char char2 = 'B';  //66
		
		System.out.println(char1 < char2); //T
		
		// 문자열 비교는 == 아니고 문자열.equals(비교대상)
		
		
		// 논리 연산자 =>  &&<->&   ||<->|
		// && => 단 하나의 조건이 F면 F. 0*1 => 0 
		// (F && T && F && T) (= 0 * 1 * 0 * 1) = F(0)
		// || => 단 하나의 조건이 T면 T.
		// (F || T || F || T) (= 0 + 1 + 0 + 1) = T(0아닌 나머지 다 T)
		
		int charCode= 'A';
		
		if(charCode >= 65 && charCode <=90) { //'A'~'Z'
			System.out.println("대문자.");
		}
				
		if (!(charCode < 48) && !(charCode > 57)) { //48~57 = charCode >= 48 charCode <= 57
			System.out.println("0~9 숫자.");
		}
		// !< = >=  미만<->이상 
		// !> = <=  초과<->이하
		
		
		int value2 = 6;
		
		if(value2 % 2 == 0 || value2 % 3 == 0) {
			System.out.println("2 또는 3의 배수");
		}
		
		
		// 대입 연산자 =, +=, -+....
		
		int result5 = 0;
		
		result += 1; // result5 = result5 + 1
		result -= 1;
		result *= 3;
		result /= 10;
		
		
		// 삼항 연산자

		int score = 85;
		
		char grade = (score > 90) ? 'A' : 'B';
		// 첫 번째 연산자(score > 90) 참 -> A, 거짓 -> B
		System.out.println(grade); // -- B
		
		// =
		if(score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		
		// 중첩 삼항 연산자
		int score2 = 85;
		
		
	}
}
