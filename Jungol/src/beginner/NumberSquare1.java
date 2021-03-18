package beginner;

import java.util.Scanner;

public class NumberSquare1 {

	public static void main(String[] args) {

		// 1. n과 m을 순서대로 입력받는다.
		System.out.print("사각형의 높이 n과 너비 m을 순서대로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// 2. n행 m열의 이차원 배열을 생성한다.
		// 3. 1행 1열은 0으로 시작한다.
		// 4. for문을 m번 돌며 n행 안에서 오른쪽으로 지나가며 1씩 커진다.
		// 5. for문을 다 돌았으면 한 줄 띈다.
		// 6. 4번과 5번을 n번 반복한다.
		
		int[][] nums = new int[n][m];
		int startNum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				startNum++;
				
				System.out.printf("%d ", startNum);
			}
			
			System.out.println();
		}
		
	}

}
