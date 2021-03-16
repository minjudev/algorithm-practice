package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		// 정사각형 한 변의 길이를 입력받는다.
		System.out.print("정사각형 한 변의 길이: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// 입력받은 수만큼의 공간을 가지는 이차원 배열을 생성한다.
		int[][] nums = new int[n][n];
		
		// 열이 증가함에 따라 n씩 증가하고 행이 증가함에 따라 1씩 증가하는 배열을 만든다.
		// 0번째 행: 1부터 시작해서 n씩 증가     
		// 1번째 행: 1 + 1부터 시작해서 n씩 증가 
		// 2번째 행: 1 + 2부터 시작해서 n씩 증가
		// 3번째 행: 1 + 3부터 시작해서 n씩 증가

		for(int i=0; i<n; i++) {
			int num = 1;
			num += i;
			for(int j=0; j<n; j++) {
				nums[i][j] = num; 
				System.out.printf("%d ", num);
				num += n;
			}
			
			System.out.println();
		}	
	}	

}
