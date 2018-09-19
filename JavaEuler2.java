public class JavaEuler2{
	public static void main(String[]args){
		System.out.println(evenFibonacciSum(4000000));
	}
	public static String evenFibonacciSum (int max){
		if (max<2){
			return 0+"";
		}
		int f1 = 1;
		int f2 = 2;
		int sum = f2;

		while(f2<=max){
			int f3 = f1 + f2;
			if (f3%2 == 0){
				sum+=f3;
			}
			f1=f2;
			f2=f3;
		}
		Commas a = new Commas();
		return a.addComas(sum);

	}
	public static int fib(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
}