package study;

import java.io.IOException;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args ) throws IOException{
		/*C-HyeMi*/
		// ♠ 2 (왕실의 나이트)
		// 8 X 8 좌표 평면
		// 특정한 한 칸에 나이트가 있음
		// 나이트는 말을 타고 있기 때문에 이동할 때 L자 형태로만 이동 , 정원 밖으로 나갈 수 없음 
		// 나이트는 특정한 위치에서 2가지 경우로 이동가능
		//	1. 수평으로 두칸 이동한 뒤에 수직으로 한칸이동
		//  2. 수직으로 두칸 이동한 뒤에 수평으로 한칸이동하기
		// 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램 작성
		// 1부터 8로 표현하며 열 위치를 표현할 때는 a부터 h로 표현
		
		Scanner sc 		= 	new Scanner(System.in);
		String  text	=	sc.nextLine();
		String  [] a1	=	text.split("");
		int a			=	0;
		int cnt			=	0;
		String [] alp	=	{"a","b","c","d","e","f","g","h"};
		
		for(a = 1; a <= alp.length ; a++) {
			if(alp[a-1].equals(a1[0])) {
				a1[0]	=	String.valueOf(a);
			}
		}

		// 1. 수평으로 두칸 이동한 뒤에 수직으로 한칸이동
		// 1) 왼쪽으로 이동
		if(Integer.parseInt(a1[0]) - 2 > 0) {
			if(Integer.parseInt(a1[1])+1 < 9) cnt++;
			if(Integer.parseInt(a1[1])-1 > 0) cnt++;
		}
		// 2) 오른쪽으로 이동
		if(Integer.parseInt(a1[0]) + 2 < 9) {
			if(Integer.parseInt(a1[1])+1 < 9) cnt++;
			if(Integer.parseInt(a1[1])-1 > 0) cnt++;
		}
		
		// 2.수직으로 두칸 이동한 뒤에 수평으로 한칸이동하기
		// 1) 아래로 이동
		if(Integer.parseInt(a1[1]) +2 < 9) {
			if(Integer.parseInt(a1[0])+1 < 9) cnt++;
			if(Integer.parseInt(a1[0])-1 > 0) cnt++;
		}
		// 2) 위쪽으로 이동
		if(Integer.parseInt(a1[1]) -2 > 0) {
			if(Integer.parseInt(a1[0])+1 < 9) cnt++;
			if(Integer.parseInt(a1[0])-1 > 0) cnt++;
		}
		System.out.println(cnt);		
	}
}
