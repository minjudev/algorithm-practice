package beginner;

import java.util.Scanner;

public class CharNumber2 {

	public static void main(String[] args) {

		System.out.print("���簢�� �� ���� ���� n�� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[][] chars = new char[n][n];
		char a = 'A';
		char z = 'Z';
		
		for(int i=0; i<n; i++) 	
			for(int j=0; j<n; j++) {
				// ���� ������ ä ���� ��ȭ�Կ� ���� 1�� ������Ű��
				if(i % 2 == 0) {
					chars[j][i] = (char) a++;
				// Ȧ������ ���� ¦������ ���� �ݴ� ������ �迭�� �� ���
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