import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		for(int i=0;i<n;i++) {
			int r =n%10;
			sum =(sum*10)+r;
			n = n/10;
		}
		if(sum==temp) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}

	}

}
