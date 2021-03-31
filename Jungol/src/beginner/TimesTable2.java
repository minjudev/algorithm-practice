package beginner;

import java.util.Scanner;

public class TimesTable2 {

	public static void main(String[] args) {

		System.out.print("출력하고 싶은 구구단의 시작 범위와 끝 범위를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		// s가 e보다 작으면 s에서 1씩 더해가며 e의 범위까지 구구단 출력
		if(s < e) {
			for(int j=s; j<e+1; j++) {
				for(int i=0; i<9; i++) {
					if(j*(i+1) % 10 == j*(i+1)) {
						System.out.printf("%d * %d =  %d   ", j, i+1, j*(i+1));
					} else {
						System.out.printf("%d * %d = %d   ", j, i+1, j*(i+1));				
					}
					
					if(i%3 == 2) System.out.println();
				}
				
				System.out.println();
			}
		// s가 e보다 크면 s에서 1씩 빼가며 e의 범위까지 구구단 출력
		} else {
			for(int j=s; j>e-1; j--) {
				for(int i=0; i<9; i++) {
					if(j*(i+1) % 10 == j*(i+1)) {
						System.out.printf("%d * %d =  %d   ", j, i+1, j*(i+1));
					} else {
						System.out.printf("%d * %d = %d   ", j, i+1, j*(i+1));				
					}
					
					if(i%3 == 2) System.out.println();
				}
				
				System.out.println();
			}
		}	
	
	}

}
