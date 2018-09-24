import java.util.ArrayList;
public class JavaEuler5{
	public static void main(String[]args){
		System.out.println(smallestPosEven());
	}
	public static int smallestPosEven (){
		boolean isTrue = true;
		int i = 1;
		while (isTrue){
			if (isDivisible(i)){
				return i;
			}
		i++;
		}
	return -1;
	}

	
	public static boolean isDivisible(int n) {
		for(int i = 1; i < 20; i++) {
			if(n % i != 0) {
				return false;
			}
		}
		return true;
	}
}