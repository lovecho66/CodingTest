package study;

import java.io.IOException;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args) throws IOException {
		// ♠예제3-1(거스름돈)
		// 거스름돈 : 500원, 100원, 50원 , 10원
		// 손님에게 거슬러 줘야 할 돈이 N원
		// 거슬러줘야 할 동전의 최소 개수
		// 거슬러 줘야 할 돈 N은 항상 10의 배수

		/* C-HyeMi */
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt(); // 지불
		// int unit = new int[500,100,50,10];
		int cnt = 0; // 거스름돈 갯수

		while (pay != 0) {
			if (pay % 500 == 0) {
				pay = pay - 500;
			} else if (pay % 100 == 0) {
				pay = pay - 100;
			} else if (pay % 50 == 0) {
				pay = pay - 50;
			} else if (pay % 10 == 0) {
				pay = pay - 10;
			}
			cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}
}
