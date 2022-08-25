import java.util.Arrays;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new  int [][] {{1,2},{4,5},{8,9}};
		int [][] newmatrix= new int [2][3];
		int [][] multimatrix = new int[3][1];
		
		//1st loop for row of matrix 
		for(int i = 0;i<matrix.length;i++) {
			//2nd loop for row of transpose matrix
			int a = 1;
			for(int j = 0 ; j<2;j++) {
				newmatrix[j][i] = matrix[i][j];
				a = a*  matrix[i][j];
				
			}
			multimatrix[i][0] = a; 
			
		}
		// matrix multiplication
		System.out.println("multiply of matrix is" + Arrays.deepToString(multimatrix));
		
		
		//Transpose matrix
		System.out.println("Transpose matrix is" + Arrays.deepToString(matrix));
		
		
		
		
	
		
	}

}
