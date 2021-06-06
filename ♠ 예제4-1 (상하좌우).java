package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Commit {
	public static void main(String[] args ) throws IOException{
		/*C-HyeMi*/
		// ♠ 예제4-1 (상하좌우)
		// N X N 크기의 정사각형 공간
		// 가장 위쪽 좌표 (1,1) 가장 오른쪽 아래 좌표 (N,N)
		// 상,하,좌,우 방향으로 이동가능
		// 시작좌표는 (1,1)
		// L : 왼쪽으로 , R : 오른쪽으로 , U : 위로 , D : 아래로 
		// 한칸 이동
		Scanner sc 				= 	new Scanner(System.in);
		int n 					= 	sc.nextInt();
		sc.nextLine();
		int				x		=   1;
		int				y		=   1;
		
		String text 			= 	sc.nextLine();
		String [] 	move 		= 	text.split(" ");
		
		sc.close();

		// L : 왼쪽(y좌표 -1) , R : 오른쪽으로(y좌표 +1) 
		// U : 위로(x좌표 -1) , D : 아래(x좌표 +1) 
		for(int i = 0 ; i < move.length ; i++) {
			if("L".equals(move[i])){
				//y좌표 -1
				if(y > 1) {	
					y --;
				}
			}else if("R".equals(move[i])) {
				//y좌표 +1
				if(y < n) {	
					y ++;
				}
			}else if("U".equals(move[i])) {
				//x좌표 -1
				if(x > 1) {
					x --;
				}
			}else if("D".equals(move[i])) {
				//x좌표 +1
				if(x < n) {	
					x ++;
				}
			}
		}
		System.out.println(x+" "+ y);
	}
}
