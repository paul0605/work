package com.apaul.matrix;

public class Rotate {
	
	static int order = 5;
	
	public static void main(String [] args){
		int[][] matrix = new int[order][order];
		
		for (int i = 0; i <order; i++){
			for(int j = 0; j <order; j++){
				matrix[i][j] = i+j;
			}
		}
		
		rotate(matrix);
	}

	private static void print(int[][] matrix) {
		for (int i = 0; i <order; i++){
			System.out.print(" [ ");
			for(int j = 0; j <order; j++){
				System.out.print( matrix[i][j]+ " ");
			}
			System.out.println("] ");
		}
		
	}
	
	private static void rotate(int[][] matrix) {
		print(matrix);
		System.out.println("*************");
		for (int level = 0; level < order/2 ; level ++ ){
			for (int i = level ; i < (order - level -1); i++){
				
				int t = matrix[level][i];
				matrix[level][i] = matrix[order -i -1][level];
				matrix[order -i -1][level] = matrix[order - level -1][order -i -1];
				matrix[order - level -1][order -i -1] = matrix[i][order - level -1];
				matrix[i][order - level -1] = t;
			}
			
			
		}
		print(matrix);
	}

	
	
	

}
