package beginner;

import java.util.Scanner;

public class NumberSquare4 {

	public static void main(String[] args) {

		System.out.print("���簢���� �� ���� ���� n�� ���� m�� ������� �Է��ϼ���: ");
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
				// Ȧ����° ���� ��Ҵ� 1�� ���ذ��� �迭�� �״�� ���
				// ¦����° ���� ��Ҵ� 1�� ���ذ��� �迭�� �Ųٷ� ���
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
				// ���������� 1ĭ�� �����ϸ� �ڽ��� ���� ���ڸ�ŭ ������
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
