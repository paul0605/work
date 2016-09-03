package com.apaul.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayGivenSum {

	public static void main(String[] args) {
		int [] arr = {-4, 6, 0, -7, 1, 5, 2, 4};
		int sum = 1;
		findSubArray(arr, sum);
	}

	private static void findSubArray(int[] arr, int sum) {
		int currSum = 0;
		List<String> counter = new ArrayList<String>();  
		Map<Integer, List<Integer>> oMap = new HashMap<Integer, List<Integer>>();
		for(int i = 0; i < arr.length; i++){
			currSum = currSum + arr[i];
			if(currSum == sum){
				counter.add("Index from "+0+" and "+i);
			}
			
			if(oMap.get(currSum-sum) != null){
				List<Integer> oList = oMap.get(currSum-sum);
				for(Integer oInt : oList){
					int x = oInt+1;
					counter.add("Index from "+x+" and "+i);
					
				}
				oList.add(i);
				
			}else{
				List<Integer> oList = new ArrayList<Integer>();
				oList.add(i);
				oMap.put(currSum, oList);
			}
		}
		
		print(counter);
		
	}

	private static void print(List<String> counter) {
		
		for(String str : counter ){
			System.out.println(str);
		}
		
	}

}
