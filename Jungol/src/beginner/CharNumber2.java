package beginner;

import java.util.Scanner;

public class CharNumber2 {

	public static void main(String[] args) {

		System.out.print("정사각형 한 변의 길이 n을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[][] chars = new char[n][n];
		char a = 'A';
		char z = 'Z';
		
		for(int i=0; i<n; i++) 	
			for(int j=0; j<n; j++) {
				// 열은 고정한 채 행이 변화함에 따라 1씩 증가시키기
				if(i % 2 == 0) {
					chars[j][i] = (char) a++;
				// 홀수열일 때는 짝수열일 때와 반대 순서로 배열에 값 담기
				} else { 
					chars[n-1-j][i] = (char) a++;
				}	
				
				if(a == z+1)
					a = 'A';
			}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%c ", chars[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
