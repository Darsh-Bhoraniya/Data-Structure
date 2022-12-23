import java.util.Scanner;
public class Factorial_Using_Recursion{
	public static void main(String[] args) {
		int n ;		
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter Number For Factorial");
		n=sc.nextInt();
		factorial fact1= new factorial();
		int answer=fact1.printlnFactorial(n);
		System.out.println("Factorial = "+ answer);
	}
}

class factorial{
	int fact = 1;
	public int printlnFactorial(int n){
		if (n==0 || n==1) {
			return 1;
		}
		else{
			return n*printlnFactorial(n-1);
		}
	}
}