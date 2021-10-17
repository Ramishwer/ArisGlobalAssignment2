
public class Question2 {

	public static void main(String[] args) {
		int num=153,rem,originalno;
		int result=0;
		originalno=num;
		
		while(originalno!=0) {
			rem=originalno%10;
            result += Math.pow(rem, 3);
            originalno/=10;
		}
		
		if(result==num) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");

		}
	}

}
