package beginner;

import java.util.Scanner;

public class NumberSquare4 {

	public static void main(String[] args) {

		System.out.print("정사각형의 한 변이 길이 n과 종류 m을 순서대로 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] nums = new int[n][n];
		
		switch (m) {
			case 1: 
				int index1 = 1;
				for(int j=0; j<n; j++) {
					for(int i=0; i<n; i++) {
						nums[j][i] = index1;
						System.out.printf("%d ", nums[j][i]);
					}
						
					index1++;
					System.out.println();
				}	
				break;
			case 2:
				// 홀수번째 행의 요소는 1씩 더해가며 배열에 그대로 담고
				// 짝수번째 행의 요소는 1씩 더해가며 배열에 거꾸로 담기
				for(int j=0; j<n; j++) {
					int index2 = 0;
					for(int i=0; i<n; i++) {
						if(j % 2 == 0) {
							index2++;
							nums[j][i] = index2;
						} else {
							index2++;
							nums[j][n-1-i] = index2;
						}
					}
				}
				
				for(int j=0; j<n; j++) {
					for(int i=0; i<n; i++) {
						if(j % 2 == 0) {
							System.out.printf("%d ", nums[j][i]);
						} else {
							System.out.printf("%d ", nums[j][i]);
						}
					}
					
					System.out.println();
				}
				break;
			case 3:
				// 오른쪽으로 1칸씩 진행하며 자신의 열의 숫자만큼 곱해짐
				int index3 = 1;
				for(int j=0; j<n; j++) {
					for(int i=0; i<n; i++) {
						nums[j][i] = index3 * (i+1);
						System.out.printf("%d ", nums[j][i]);
					}
					
					index3++;
					System.out.println();
				}
				break;	
		} 
		
	}

}
