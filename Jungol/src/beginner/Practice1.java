package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		// ���簢�� �� ���� ���̸� �Է¹޴´�.
		System.out.print("���簢�� �� ���� ����: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// �Է¹��� ����ŭ�� ������ ������ ������ �迭�� �����Ѵ�.
		int[][] nums = new int[n][n];
		
		// ���� �����Կ� ���� n�� �����ϰ� ���� �����Կ� ���� 1�� �����ϴ� �迭�� �����.
		// 0��° ��: 1���� �����ؼ� n�� ����     
		// 1��° ��: 1 + 1���� �����ؼ� n�� ���� 
		// 2��° ��: 1 + 2���� �����ؼ� n�� ����
		// 3��° ��: 1 + 3���� �����ؼ� n�� ����

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
