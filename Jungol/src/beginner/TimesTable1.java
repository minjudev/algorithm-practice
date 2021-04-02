package beginner;

import java.util.Scanner;

public class TimesTable1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean index = true;
		int s = 0;
		int e = 0;
		
		// �־��� ������ ��� ���� �Է¹��� ��� ������ �ٽ� �Է¹޴´�.
		while(index) {
			System.out.print("����ϰ� ���� �������� ���� ������ �� ����(2 ~ 9)�� �Է��ϼ���: ");
			s = scan.nextInt();
			e = scan.nextInt();
			
			if(!(2<=s && s<=9) || !(2<=e && e<=9)) {
				index = true;
				System.out.println("INPUT ERROR!");
			} else if((2<=s && s<=9) && (2<=e && e<=9))
				index = false;
		}
		
		// ���� �������� �� ������ Ŭ ���
		if(s < e) { 
			// ���� �������� �� �������� 1�ܺ��� ����ϰ� 1���� ��� ��������� ���� �� �� �� ���� ��(+1)���� �Ѿ��.
			for(int i=0; i<9; i++) {
				for(int j=s; j<e+1; j++) 
					if(j*(i+1) % 10 == j*(i+1)) {
						System.out.printf("%d * %d =  %d   ", j, i+1, j*(i+1));
					} else { 
						System.out.printf("%d * %d = %d   ", j, i+1, j*(i+1));
					}
				
				System.out.println();
			}
		// ���� ������ �� �������� Ŭ ���
		} else {
			// ���� �������� �� �������� 1�ܺ��� ����ϰ� 1���� ��� ��������� ���� �� �� �� ���� ��(-1)���� �Ѿ��.
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
