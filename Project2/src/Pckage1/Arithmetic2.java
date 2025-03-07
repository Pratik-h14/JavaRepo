package Pckage1;

public class Arithmetic2 {

	public int sub(int a, int b) {
		int c = a-b;
		System.out.println("Sub is "+c); 
		return c; 
	}
	public int sum(int x, int y) {
		int z = x+y;
		System.out.println("Sum is "+z);
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
		Arithmetic2 obj = new Arithmetic2();
		int subResult1 = obj.sub(10, 2);
		int sumResult = obj.sum(subResult1, 2);
		int multiplyResult = obj.multiply(sumResult, 2);
		int subResult2 = obj.sub(multiplyResult, 2);
		obj.divide(subResult2, 2);
	}
}
