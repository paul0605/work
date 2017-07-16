package com.algo.practice.string;

/**
 * For a given string " Hi there, how  are you   doing? " remove all spaces.
 * @author apaul5
 *
 */
public class RemoveSpace {

	public static void main(String[] args) {
		String s = " Hi there, how  are you   doing? ";

		char[] carr = s.toCharArray();
		int spaceIndex = 0;
		for (int i = 0; i < carr.length; i++) {
			char a = carr[i];
			
			if (a == ' ') {
				spaceIndex++;
			}else{
				carr[i-spaceIndex] = carr[i];
			}
		}
		System.out.println(String.valueOf(carr, 0, carr.length - spaceIndex));
	}
	
	
}
