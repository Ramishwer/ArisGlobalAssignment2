import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			int x=1;
			for(int k=i;k<=n;k++) {
				System.out.print(x++ +" ");

			}
			
			int y=x-2;
			for(int l=1;l<=n-i;l++) {
				System.out.print(y-- + " ");
			}
			System.out.println();

		}
		
	}

}
