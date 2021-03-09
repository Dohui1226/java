package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 *2. 반지름을 입력 : 1
  * 반지름이 1일때, 원둘레는 xxx이고, 원넓이는 xxxx이다.
 */
public class HomeworkMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int num =sc.nextInt();
		double PAI_NAME = 3.14;
		System.out.printf("반지름 %d일때, 원둘레는 %.3f이고, 원넓이는 %.3f이다. ",num ,2* num*PAI_NAME,num*num*PAI_NAME );

	}

}
