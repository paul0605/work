package com.algo.practice;

public class ArraySwap {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int n = 4;
		//int j = n -1;
		
		for (int i = 0, j = n-1; i < n; i++, j--){
			
			if(!((i == j) || ((i - j) == 1 ))){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				System.out.println(" i "+i + " "+ arr[i]+" j "+j+" "+arr[j]);
			}else{
				break;
			}
			//j--;
			//i++;
		}
		
		for (int i = 0; i <10; i ++){
			System.out.println("arr["+i+"] = "+ arr[i]);
		}

	}

}
