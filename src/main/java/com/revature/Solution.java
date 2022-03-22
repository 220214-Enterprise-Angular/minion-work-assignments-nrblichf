package com.revature;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	/**
	 * Implement the method below, then right click on
	 * SolutionTests.java within src/test/java/ -> com.revature to test your code
	 * before committing and pushing to your repository.
	 */
	
	public static int[] solution(int[] data, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result;
		int newSize = data.length;
		
		if (n == 0)
			return new int[0];
		
		for (int d : data) {
			Integer i = map.get(d);
			
			if (i == null) {
				map.put(d, 1);
			} else if (i >= n) {
				newSize = newSize - (i + 1);
				map.put(d, -1);
			} else if (i != -1) {
				map.put(d, i + 1);
			} else {
				newSize--;
			}
		}
		
		int j = 0;
		result = new int[newSize];
		for (int d : data) {
			if (map.get(d) != -1) {
				result[j] = d;
				j++;
			}
		}
		
		return result;
	}
}