package Pckage1;

public class Arithmetic {

	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum is "+c); 
		return c; 
	}
	public int sub(int x, int y) {
		int z = x-y;
		System.out.println("Sub is "+z);
		return z;
	}
	public int multiply(int u, int v) {
		int w = u*v;
		System.out.println("Multiplication is "+w);
		return w;
	}
	public void divide(int m, int n) {
		int p = m/n;
		System.out.println("Divide is "+p);
	}
	public static void main(String[]args) {
		Arithmetic obj = new Arithmetic();
		int sumResult1 = obj.sum(10, 2);
		int sumResult2 = obj.sum(sumResult1, 2);
		int subResult = obj.sub(sumResult2, 2);
		int multiplyResult = obj.multiply(subResult, 2);
		obj.divide(multiplyResult, 2);
	}
}
