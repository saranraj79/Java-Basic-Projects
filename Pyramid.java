public class Pyramid{
	public static void main(String[] args){
		for(int i =0;i<=5;i++){
			for(int j =5-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k =0;k<=i;k++){
				System.out.print(" " +k);
			}
			System.out.println();
		}
	}
}