public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.getRecursiveFactorial(6));
		System.out.println(factorial.getIterativeFactorial(6));
	}
	
	public int getRecursiveFactorial(int n) {
		if (n < 0) return -1;
		else if (n < 2) return 1;
		else return (n * getRecursiveFactorial(n-1));		
	}
	
	public int getIterativeFactorial(int n) {
		int f[] = new int[n+1];
		int i;
		f[0] = 1;
	
		for(i=1;i<=n;i++)
			f[i] = i * f[i-1];
		return f[n];
	}
}