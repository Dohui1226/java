package kr.ac.kopo.day02;

import java.util.Scanner;
/*
 * 2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
 * 첫번째 정수 : 12
 * 두번째 정수 : 5
 * 12+5=17
 * 12-5=7
 * 12*5=60
 * 12/5=2.40 소수점 둘째짜리 출력
 * 12%5*=2
 */
public class HomeworkMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 =sc.nextInt();
		System.out.print("두번째 정수: ");
		int num2 =sc.nextInt();
		
		float div = (float)num1/(float)num2;
		System.out.println(num1+"+"+num2+ "=" +(num1+num2));
		System.out.println(num1+"-"+num2+ "="+ (num1-num2));
		System.out.println(num1+"*"+num2+ "="+(num1*num2));
		System.out.printf(num1+"/"+num2+ "=%.2f \n",div);
		System.out.println(num1+"%"+num2+ "="+(num1%num2));
	}

}


/*2960원어치 물건을 사고 5000원을 입력했을 때 거스름돈과 1000,500,100,50,10원의 개수를 출력하는 코드를 작성
 *  물건값을 입력 : 2960
 *  지불한 액수를 입력 : 5000
 *  
 *  <방식1>
 *  거스름돈:2040
 *  1000원:2개
 *  500원:0개
 *  100원:0개
 *  50원:0개
 *  10원:4개 
    <방식1>
 *  거스름돈:2040
 *  1000원:2개
 *  10원:4개 
 *  ---------------------------------
 *  물건값을 입력 : 2960
 *  지불한 액수를 입력 : 2000
 *  
 *  960원이 부족합니다.
 *  
 *  
 *  4. 두개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성(조건연산자(1), if문을 이용(2))
 *  첫번째 정수 입력:12
 *  두번째 정수 입력:4
 *  
 *  12가 4의 배수인지 판단 결과 : true
 *  //12가 4의 배수인지 판단 결과 : 참
 *  
 *  첫번째 정수 입력:12
 *  두번째 정수 입력:5
 *  
 *  12가 5의 배수인지 판단 결과 : false
 *   
 *  첫번째 정수 입력:12
 *  두번째 정수 입력:0
 *  
 *  12가 0의 배수인지 판단 결과 : false
 */