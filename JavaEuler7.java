import java.util.ArrayList;
public class JavaEuler7{
	public static void main(String[]args){
		System.out.println(numthPrime(10001));
	}
	public static double numthPrime (double num){
		int numOfPrimes = 0;
		double isThisPrime = 1;
		while(numOfPrimes < num){
			isThisPrime++;
			if(isPrime(isThisPrime)){
				numOfPrimes++;
			}
		}
		return isThisPrime;
	}

	public static boolean isPrime (double number){
		if(number<2){
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++){
			if (number%i == 0){
				return false;
			}
		}
		return true;
	}
}