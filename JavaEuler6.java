import java.util.ArrayList;
public class JavaEuler6{
	public static void main(String[]args){
		System.out.println(sumsMinus(100));
	}
	public static int sumsMinus(int largest){
		int squareSum= 0;
		for(int i = 1; i<=largest; i++){
			squareSum+=i;
		}
		squareSum=squareSum*squareSum;

		int sumSquare=0;
		for(int i =1; i<=largest;i++){
			sumSquare+=i*i;
		}
		return sumSquare-squareSum;
	}
}