public class JavaEuler{
	public static void main(String[]args){
		System.out.println(sumMultiplesBelowInt(3,5,100));
	}
	//takes in 2 multiples and a number to end on
	//returns sum of the multiples below specified int
	public static int sumMultiplesBelowInt(int firstMult, int secondMult, int finalNum){
		int sum = 0;
		int theNum = 0;
		int i = 1;
		while (theNum<=finalNum){
			theNum = firstMult*i;
			if(theNum%secondMult!=0){
				sum+= theNum;
			}
			i++;
		}
		theNum = 0;
		i=1;
		while (theNum<=finalNum){
			theNum = secondMult*i;
			sum+= theNum;

			i++;
		}
		return sum;
	}
}