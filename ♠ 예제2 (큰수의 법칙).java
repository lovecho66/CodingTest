package study;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args) throws IOException {
		/*C-HyeMi*/
		//♠ 예제2 (큰수의 법칙)
		//문제 : 다양한 수로 이루어진 배열이 있을 때 주어진 수들을
		//		 M번 더해서 가장 큰 수를 만드는 법칙이다.
		//		 단,배열의 특정 인덱스(번호)에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없음
		Scanner sc			=	new Scanner(System.in);
		int	 	size		=	sc.nextInt();			// 배열 크기
		int		sumCnt		=	sc.nextInt();			// 더할 수 
		int	 	limitCnt	=	sc.nextInt();			// 제한 수 
		Integer[] 	arr		= 	new Integer[size];		// 수 
		int		result		=	0;						//결과
		int 	cnt			=	0;
		
		for(int i = 0 ; i < size	; i++) {
			arr[i]	=	sc.nextInt();	//배열구성
		}
		
		Arrays.sort(arr, Collections.reverseOrder());// 내림차
		
		for(int i = 0 ; i < sumCnt; i++ ) {
			if(limitCnt == cnt) {
				result	+= arr[1];
				cnt 	= -1; 
			}else {
				result += arr[0];
			}
			cnt++;
		}
		System.out.println(result);
		sc.close();
	}
}
