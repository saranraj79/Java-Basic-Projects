import java.util.Scanner;

public class FabonacciSeries{
	public static void main(String[] args){
		int firstNumber=0,secondNumber=1,nextNumber,i,n;
		System.out.println("Enter the number of terms:");
		Scanner scanner =new Scanner(System.in);
		n=scanner.nextInt();
		if(n<=0) {
			System.out.println("Enter Positive number");
		}else {
			System.out.println("\tFibonacci Series...\n");
			for( i=0;i<n;i++) {
				if(i==0) {
					System.out.print(firstNumber);
				}else if(i==1){
					System.out.print(" "+secondNumber);
				}else {
					nextNumber = firstNumber + secondNumber;
					System.out.print(" "+ nextNumber);
					firstNumber = secondNumber;
					secondNumber = nextNumber;
				}
			}
		}
		scanner.close();
	}
}