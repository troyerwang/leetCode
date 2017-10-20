package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_1 {
	
	public static void main(String[] args) {
		
		int[] t1 = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(twoSum(t1, 9)));
		System.out.println(Arrays.toString(twoSum(t1, 22)));
		System.out.println(Arrays.toString(twoSum(t1, 8)));
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
