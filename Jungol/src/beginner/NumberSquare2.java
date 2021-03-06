package beginner;

import java.util.Scanner;

public class NumberSquare2 {

	public static void main(String[] args) {

		System.out.print("사각형의 높이 n과 너비 m을 순서대로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// 1. 높이 n과 너비 m의 이차원 배열을 생성한다.
		int[][] nums = new int[n][m];
		int startNum = 1;
		
		
		// 2. 높이 n의 홀수 행이라면 오른쪽으로 너비 m만큼 가며 순서대로 1씩 증가시키고 그 값을 홀수 행의 배열에 담는다. 
		// 3. 높이 n의 짝수 행이라면 오른쪽으로 너비 m만큼 가며 순서대로 1씩 감소시키고 그 값을 짝수 행의 배열에 담는다.
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<m; j++) {
					nums[i][j] = startNum++; 
				}
			} else {
				for(int j=m-1; j>=0; j--) {
					nums[i][j] = startNum++;
				}
			}			
		}
		
		// 4. if문(높이 n의 홀수 행)을 실행해서 배열에 담긴 값은 순서대로 출력한다.
		// 5. else문(높이 n의 짝수 행)을 실행해서 배열에 담긴 값은 오른쪽 요소부터 출력한다.
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<m; j++) {
					System.out.printf("%d ", nums[i][j]);
				}
			} else {
				for(int j=m-1; j>=0; j--) {
					System.out.printf("%d ", nums[i][(m-1-j)]);
				}
			}
			
			System.out.println();
		}
	}

}
