package beginner;

import java.util.Scanner;

public class NumberSquare1 {

	public static void main(String[] args) {

		// 1. n�� m�� ������� �Է¹޴´�.
		System.out.print("�簢���� ���� n�� �ʺ� m�� ������� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// 2. n�� m���� ������ �迭�� �����Ѵ�.
		// 3. 1�� 1���� 0���� �����Ѵ�.
		// 4. for���� m�� ���� n�� �ȿ��� ���������� �������� 1�� Ŀ����.
		// 5. for���� �� �������� �� �� ���.
		// 6. 4���� 5���� n�� �ݺ��Ѵ�.
		
		int[][] nums = new int[n][m];
		int startNum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				startNum++;
				
				System.out.printf("%d ", startNum);
			}
			
			System.out.println();
		}
		
	}

}
