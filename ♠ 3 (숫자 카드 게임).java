package study;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args ) throws IOException{
		/*C-HyeMi*/
		// ♠ 3 (숫자 카드 게임)
		//문제 : 숫자 카드 게임은 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑는게임 
		//		 1. N은 행의 개수 , M은 열의 개수
		//		 2. 뽑고자 하는 카드가 포함되어 있는 행을 선택
		//		 3. 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑기
		//		 4. 따라서 처음에 카드를 골라낼 행을 선택할 때 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을
		//			것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야한다. 
		Scanner 	sc			=	new Scanner(System.in);
		int	 		verti		=	sc.nextInt();				// 세로
		int			hori		=	sc.nextInt();				// 가로
		int[][] 	arr			= 	new int[verti][hori];		//[세로크기][가로크기]
		Integer[] 	arr2		= 	new Integer[verti];			// 수 
		for(int i = 0 ; i < verti; i++) { 
			//세로 
			for(int j = 0 ; j < hori ; j++) {
				//가로
				arr[i][j] = sc.nextInt();
				if(j == 0) {
					arr2[i]	=	arr[i][j];
				}else {
					if(arr[i][j] < arr[i][j-1]) {	
						arr2[i]	=	arr[i][j];
					}
				}
			}
		}
		sc.close();
		Arrays.sort(arr2, Collections.reverseOrder());// 내림차수
		System.out.println(arr2[0]);
	}
}
