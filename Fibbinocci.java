package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int n=10;
		int j=0; int k=1; int l=0;
		System.out.println(j);
		System.out.println(k);
		for (int i = 1; i<n; i++) {
			l=j+k;
			j=k;
			k=l;
			
			System.out.println(k);
		}		
	}

}
