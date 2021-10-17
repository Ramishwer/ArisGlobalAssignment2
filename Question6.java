
public class Question6 {

	public static void main(String[] args) {

		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(n+k-i+" ");
			}
			
			for(int l=i;l>1;l--) {
				System.out.print(n-i+l-1+" ");
			}
			
			System.out.println();
		}
	}

}
