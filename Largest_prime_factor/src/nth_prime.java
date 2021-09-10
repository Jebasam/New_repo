import java.util.Scanner;
public class nth_prime {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long n=scanner.nextLong();
		long prime=2,i;
		while(n>0) {
		for(i=2;i<prime;i++) {
			if(prime%i==0) {
				break;
			}
		}
		if(i==prime) {
			n--;
		}
		prime++;

	}
		System.out.println(prime-1);
		}

}
