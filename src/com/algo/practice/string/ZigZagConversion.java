package com.algo.practice.string;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 *
 *	P   A   H   N
 *	A P L S I I G
 *	Y   I   R
 *	And then read line by line: "PAHNAPLSIIGYIR"
 * @author apaul5
 *
 */
public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		convert(s, 3);

	}
	
	public static void convert(String s, int numRows) {
        
        char[] carr = s.toCharArray();
        
        char[][] m = new char[numRows][s.length()]; 
        int row = 0;
        int column = 0;
        
        for(int i = 0; i < carr.length; i++){
        	m[row][column] = carr[i];
            int exp = (i)/(numRows-1);
            if(exp%2 == 0){
            	row++;
            }else{
            	row--;
               column++;
            }
              
        }
        
        char[] newChar = new char[s.length()];
        int x= 0;
        for(int i =0; i < m.length; i++){
        	for(int j = 0; j< m[i].length; j++){
        		if(m[i][j] != '\u0000'){
        			newChar[x] = m[i][j];
        			x++;
        		}
        	}
        }
        
      System.out.println("   "+ String.valueOf(newChar, 0, s.length()));
    }

}
