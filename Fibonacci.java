import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.print(n1 + " " + n2+ " ");
		for(int i=2;i<a;i++) {
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(n3+ " ");
		}
	}

}
