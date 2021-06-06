package study;

import java.io.IOException;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args ) throws IOException{
		/*C-HyeMi*/
		//♠ 예제4-2 (시각)
		// 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 
		// 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램
		Scanner sc 		= 	new Scanner(System.in);
		int 	N		=	sc.nextInt();
		int		time	=	0;
		int		cnt		=	0;	
		
		for(int i = 0 ; i <= N ; i++) {				//시
			for(int j = 0 ; j < 60 ; j++) {			//분
				for(int z = 0 ; z < 60 ; z++) {		//초
					time = Integer.parseInt(String.valueOf(i)+String.valueOf(j)+String.valueOf(z));
					if((String.valueOf(time)).indexOf("3") > - 1) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);	
	}
}
