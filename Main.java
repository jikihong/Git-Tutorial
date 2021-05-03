import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		int[] ahlpa = new int[22];
		Arrays.fill(ahlpa, -1);

		for (int i = 0; i < N.length(); i++) {
			
			int a=	ahlpa[(N.charAt(i) - '0') - 49];
			if(ahlpa[a]==-1) {
				i=ahlpa[(N.charAt(i) - '0') - 49];
			}
			

		}

		for (int i = 0; i < ahlpa.length; i++) {
			System.out.print(ahlpa[i] + " ");

		}

		sc.close();

	}

}