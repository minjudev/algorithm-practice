package beginner;

import java.util.Scanner;

public class TimesTable1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean index = true;
		int s = 0;
		int e = 0;
		
		// 주어진 범위를 벗어난 값을 입력받을 경우 범위를 다시 입력받는다.
		while(index) {
			System.out.print("출력하고 싶은 구구단의 시작 범위와 끝 범위(2 ~ 9)를 입력하세요: ");
			s = scan.nextInt();
			e = scan.nextInt();
			
			if(!(2<=s && s<=9) || !(2<=e && e<=9)) {
				index = true;
				System.out.println("INPUT ERROR!");
			} else if((2<=s && s<=9) && (2<=e && e<=9))
				index = false;
		}
		
		// 시작 범위보다 끝 범위가 클 경우
		if(s < e) { 
			// 시작 범위에서 끝 범위까지 1단부터 출력하고 1단을 모두 출력했으면 줄을 띄어쓴 후 그 다음 단(+1)으로 넘어간다.
			for(int i=0; i<9; i++) {
				for(int j=s; j<e+1; j++) 
					if(j*(i+1) % 10 == j*(i+1)) {
						System.out.printf("%d * %d =  %d   ", j, i+1, j*(i+1));
					} else { 
						System.out.printf("%d * %d = %d   ", j, i+1, j*(i+1));
					}
				
				System.out.println();
			}
		// 시작 범위가 끝 범위보다 클 경우
		} else {
			// 시작 범위에서 끝 범위까지 1단부터 출력하고 1단을 모두 출력했으면 줄을 띄어쓴 후 그 다음 단(-1)으로 넘어간다.
			for(int i=0; i<9; i++) {
				for(int j=s; j>e-1; j--) 
					if(j*(i+1) % 10 == j*(i+1)) { 
						System.out.printf("%d * %d =  %d   ", j, i+1, j*(i+1));
					} else { 
						System.out.printf("%d * %d = %d   ", j, i+1, j*(i+1));
					}
				
				System.out.println();
			}
		}
		
	}

}
