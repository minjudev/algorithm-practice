package beginner;

import java.util.Scanner;

public class TimesTable2 {

	public static void main(String[] args) {

		System.out.print("����ϰ� ���� �������� ���� ������ �� ������ �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		// s�� e���� ������ s���� 1�� ���ذ��� e�� �������� ������ ���
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
		// s�� e���� ũ�� s���� 1�� ������ e�� �������� ������ ���
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
