package beginner;

import java.util.Scanner;

public class CharNumber1 {

	public static void main(String[] args) {

		System.out.print("정사각형 한 변의 길이 n을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[][] chars = new char[n][n];
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				chars[n-1-j][n-1-i] = (char) ('A' + sum); // 행과 열 모두 n부터 1의 순서로 값을 집어넣는 대신 열부터 먼저 값을 집어넣는다.
				sum++;
				
				if(sum == 26) { // 배열에 담는 알파벳 값이 Z를 넘어서면 다시 A로 초기화시킨다.
					sum = 0;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) 
				System.out.printf("%c ", chars[i][j]);
		
			System.out.println();
		}	
		
	}

}
