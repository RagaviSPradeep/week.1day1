package week1.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int num=13;
		int m=num/2;
		int rem=0;
		for (int i = 2; i <=m; i++) {
		if(num%i==0) {
			System.out.println("It is non prime");
			rem=1;
			break;
		}if(rem==0) {
			System.out.println("It is prime");
		}
		}

	}

}
