package code;

public class Problem_12 {

	public static void main(String[] args) {
		
		int t1 = 3998;
		int t2 = 3999;
		
		System.out.println(intToRoman(t1));
		System.out.println(intToRoman(t2));
		
	}
	
	public static String intToRoman(int num) {
        String result = "";
        // 定义罗马特殊字符和数字的对应关系
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 循环减去最大标记数，增加对应的字符
        for (int i = 0; num != 0; i++) {
        	while (num >= values[i]) {
        		num -= values[i];
        		result += symbol[i];
        	}
        }
        return result;
    }
}
