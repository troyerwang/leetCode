package code;

public class Problem_13 {

	public static void main(String[] args) {

		String t1 = "MMMCMXCVIII";
		String t2 = "MMMCMXCIX";
		
		System.out.println(romanToInt(t1));
		System.out.println(romanToInt(t2));
		
	}

	public static int romanToInt(String s) {
		int result = 0;
		String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 循环匹配开始字符（从大到小），增加对应的数值
        for (int i = 0; i < symbol.length; i++) {
        	while (s.startsWith(symbol[i])) {
        		s = s.replaceFirst(symbol[i], "");
        		result += values[i];
        	}
        }
		return result;
	}
}
