import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		int f = 1,number;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		number = sc.nextInt();
		for(int i = 1; i <= number; i++){
			f = f * i;
		}
		System.out.println("Factorial of " +number+" is "+f);
	}
}