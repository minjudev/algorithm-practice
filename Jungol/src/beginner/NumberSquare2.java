package beginner;

import java.util.Scanner;

public class NumberSquare2 {

	public static void main(String[] args) {

		System.out.print("�簢���� ���� n�� �ʺ� m�� ������� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// 1. ���� n�� �ʺ� m�� ������ �迭�� �����Ѵ�.
		int[][] nums = new int[n][m];
		int startNum = 1;
		
		
		// 2. ���� n�� Ȧ�� ���̶�� ���������� �ʺ� m��ŭ ���� ������� 1�� ������Ű�� �� ���� Ȧ�� ���� �迭�� ��´�. 
		// 3. ���� n�� ¦�� ���̶�� ���������� �ʺ� m��ŭ ���� ������� 1�� ���ҽ�Ű�� �� ���� ¦�� ���� �迭�� ��´�.
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<m; j++) {
					nums[i][j] = startNum++; 
				}
			} else {
				for(int j=m-1; j>=0; j--) {
					nums[i][j] = startNum++;
				}
			}			
		}
		
		// 4. if��(���� n�� Ȧ�� ��)�� �����ؼ� �迭�� ��� ���� ������� ����Ѵ�.
		// 5. else��(���� n�� ¦�� ��)�� �����ؼ� �迭�� ��� ���� ������ ��Һ��� ����Ѵ�.
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<m; j++) {
					System.out.printf("%d ", nums[i][j]);
				}
			} else {
				for(int j=m-1; j>=0; j--) {
					System.out.printf("%d ", nums[i][(4-j)]);
				}
			}
			
			System.out.println();
		}
	}

}