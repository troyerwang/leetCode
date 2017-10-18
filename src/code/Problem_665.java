package code;

public class Problem_665 {

	public static void main(String[] args) {
		
		int[] t1 = {3, 4, 2, 3}; // false
		int[] t2 = {3, 4, 2, 1}; // false
		int[] t3 = {1, 2, 3, 4}; // true
		int[] t4 = {1, 2, 5, 4}; // true
		int[] t5 = {4, 3, 2, 1}; // false
		
		// 执行Solution
		System.out.println("t1: " + checkPossibility(t1));
		System.out.println("t2: " + checkPossibility(t2));
		System.out.println("t3: " + checkPossibility(t3));
		System.out.println("t4: " + checkPossibility(t4));
		System.out.println("t5: " + checkPossibility(t5));
		
	}
	
	public static boolean checkPossibility(int[] nums) {
		// 修改次数
		int time = 0;
		// 增加prev临时变量处理判断（哨兵）
        for (int i = 1, prev = nums[0]; i < nums.length; i++) {
            if (nums[i] < prev && time++ > 0) return false;
            if (nums[i] < prev && i - 2 >= 0 && nums[i - 2] > nums[i]) continue;
            prev = nums[i];
        }
		return true;
	}
}
