package study;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args ) throws IOException{
		/*C-HyeMi*/
		//♠ 4 (1이 될 때까지) 
		//문제 : N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행
		//		 단,두 번째 연산은 N이 K로 나누어떨어질 때만 선택할 수 있다. 
		//		 1. N에서 1을 뺀다.
		//		 2. N을 K로 나눈다.
		//N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야하는 최소횟수
		Scanner 	sc		=	new Scanner(System.in);
		int	 		n		=	sc.nextInt();				// 주어진 수
		int			k		=	sc.nextInt();				// 나눌 수
		int			cnt		=	0;
		
		while(n != 1) {	//1이 될 때까지 (1이 아닐때까지 돌기)
			if(n % k == 0) {
				n /= k;	//나누기
			}else {
				n--;	//-1
			}
			cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}
}
