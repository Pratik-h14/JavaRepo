package Pckage1;

public class MethodUsingThisKeyword {
	public void m1() {
		System.out.println("Default method"); 
	}
	public void m2(int a) {
		System.out.println("One parameterized method"); 
	}
	public void m3(int a, int b) {
		System.out.println("Two parameterized method"); 
	}
	public void m4(int a, int b, int c) {
		System.out.println("Three parameterized method"); 
	}
	public void m5(int a, int b, int c, int d) {
		this.m4(111,222,333);
		this.m1();
		this.m3(111,222);
		this.m2(111);
		System.out.println("Four parameterized method"); 
	}
	public static void main(String[] args) {
		MethodUsingThisKeyword s = new MethodUsingThisKeyword();
		s.m5(111,222,333,444); 
	}
}
