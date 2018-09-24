public class JavaEuler4{
	public static void main(String[]args){
		System.out.println(isPal());
	}
	public static String isPal() {
		int maxPalindrome = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (isPalindrome(prod) && prod > maxPalindrome)
					maxPalindrome = prod;
			}
		}
		return Integer.toString(maxPalindrome);
	}
	public static boolean isPalindrome(int prod){
		int reverse = 0;
		int helper = prod;
		while(helper != 0){
			reverse = reverse * 10 + (helper%10);
			helper = helper/10;
		}
		if (reverse == prod){
			return true;
		}
		else{
			return false;
		}
	}

}