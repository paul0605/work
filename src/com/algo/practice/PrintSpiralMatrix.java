package com.algo.practice;

/**
 * For a given 2D matrix(square or rectangular) print the matrix in spiral way.
 * e.g 1  2  3  4
 *     5  6  7  8
 *     9  10 11 12
 * Printing should be 1 2 3 4 8 12 11 10 9 5 6 7    
 * @author apaul5
 *
 */
public class PrintSpiralMatrix {

	

	private static void printSpiral(int[][] matrix, int rowBeginning, int row, int columnBeginning, int column) {
		if(rowBeginning>row || columnBeginning > column){
			return;
		}
		for (int y = columnBeginning; y < column; y++ ){
			System.out.print(matrix[rowBeginning][y]+" ");
		}
		for(int x = rowBeginning+1; x < row; x++ ){
			System.out.print(matrix[x][column-1]+ " ");
		}
		for (int y = column-2; y >= columnBeginning; y-- ){
			System.out.print(matrix[row-1][y]+" ");
		}
		for(int x = row-2; x >= rowBeginning+1; x-- ){
			System.out.print(matrix[x][column-1]+" ");
		}
		printSpiral(matrix, rowBeginning+1,row-1,columnBeginning+1,column-1);
	}

	public static void main(String[] args) {
		int row = 5;
		int column = 4;
		int[][] matrix = new int[row][column];
		for(int i =0; i < row; i++){
			for(int j = 0; j < column ; j++){
				matrix[i][j] = i;
			}
		}
		
		System.out.println("***** Input ********");
		for(int i =0; i < row; i++){
			for(int j = 0; j < column ; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("***** Output ********");
		printSpiral(matrix, 0, row, 0, column);
	}
	
}
