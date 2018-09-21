public class JavaEuler1{
	public static void main(String[]args){
		System.out.println(sumMultiplesBelowInt(3,5,1000));
	}
	//takes in 2 multiples and a number to end on
	//returns sum of the multiples below specified int as a String
	public static String sumMultiplesBelowInt(int firstMult, int secondMult, int finalNum){
		int sum = 0;
		for (int i = 1; i<finalNum; i++){
			if(i%firstMult==0||i%secondMult==0){
				sum+=i;
			}
		}
		Commas a = new Commas();
		return a.addComas(sum);
	}
}