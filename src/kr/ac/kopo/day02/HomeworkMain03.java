package kr.ac.kopo.day02;

import java.util.Scanner;

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
    <방식2>
 *  거스름돈:2040
 *  1000원:2개
 *  10원:4개 
 *  ---------------------------------
 *  물건값을 입력 : 2960
 *  지불한 액수를 입력 : 2000
 *  
 *  960원이 부족합니다.
 */ 

public class HomeworkMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력: ");
		int num1 =sc.nextInt();
		System.out.print("지불한 액수를 입력: ");
		int num2 =sc.nextInt();
		int change = num2-num1;
		
		if (num1>num2) {
			System.out.printf("%d원이 부족합니다.",(num1-num2));	
		}
		else {
		System.out.println("<방식1>");
		System.out.println("거스름돈 : "+change);
		int thousand = change/1000;
		System.out.println("1000원: " +thousand);
		int hthousand = (change -thousand*1000 )/500;
		System.out.println("500원: " + hthousand);
		int hundred = (thousand -hthousand*500 )/100;
		System.out.println("100원: " +hundred) ;
		int hhundred = (hundred-hundred*100)/50;
		System.out.println("50원: " +hhundred) ;
		int ten = (hundred-hundred*100)/50;
		System.out.println("10원: " +ten) ;
		
		System.out.println("<방식2>");
		
		
		}
	}

}
