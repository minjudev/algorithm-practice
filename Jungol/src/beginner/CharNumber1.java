package beginner;

import java.util.Scanner;

public class CharNumber1 {

	public static void main(String[] args) {

		System.out.print("���簢�� �� ���� ���� n�� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[][] chars = new char[n][n];
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				chars[n-1-j][n-1-i] = (char) ('A' + sum); // ��� �� ��� n���� 1�� ������ ���� ����ִ� ��� ������ ���� ���� ����ִ´�.
				sum++;
				
				if(sum == 26) { // �迭�� ��� ���ĺ� ���� Z�� �Ѿ�� �ٽ� A�� �ʱ�ȭ��Ų��.
					sum = 0;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) 
				System.out.printf("%c ", chars[i][j]);
		
			System.out.println();
		}	
		
	}

}