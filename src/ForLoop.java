
public class ForLoop {
	public static void main(String[] args) {
		
//		for (int number = 0; number < 5; number++) {
//		    System.out.print(number + " ");
//		}
//		System.out.println();
		
		int n = 7;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
		    factorial *= i;
			//factorial = factorial * i;
		}
		
		System.out.println(n + "! = " + factorial);

	}


}
