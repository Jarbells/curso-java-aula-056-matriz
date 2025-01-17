import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int m, n, x;
		int[][] mat;
		
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		mat = new int[m][n];		
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		x = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == x) {
					System.out.printf("Position %d,%d:%n", i, j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
