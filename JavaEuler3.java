import java.util.ArrayList;
public class JavaEuler3{
	public static void main(String[]args){
		System.out.println(largestPrimeFact(600851475143.0));
	}
	public static String largestPrimeFact(double num2Factor){
		double maxPrime=-1;
		while (num2Factor%2==0){
			maxPrime=2;
			num2Factor/=2;
		}

		for (int i=3; i<=Math.sqrt(num2Factor); i+=2){
			while(num2Factor%i==0){
				maxPrime=i;
				num2Factor/=i;
			}
		}

		if(num2Factor>2){
			maxPrime=num2Factor;
		}
		Commas a = new Commas();
		int b = (int) maxPrime;
		return a.addComas(b);
	}
}