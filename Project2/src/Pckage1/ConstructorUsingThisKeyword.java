package Pckage1;

public class ConstructorUsingThisKeyword {

	public ConstructorUsingThisKeyword() {
		this(111,222,333);
		System.out.println("Default constructor");
	}
	public ConstructorUsingThisKeyword(int a) {
		this();
		System.out.println("One parameterized constructor");
	}
	public ConstructorUsingThisKeyword(int a, int b) {
		this(111);
		System.out.println("Two parameterized constructor");
	}
	public ConstructorUsingThisKeyword(int a, int b, int c) {
		System.out.println("Three parameterized constructor");
	}
	public ConstructorUsingThisKeyword(int a, int b, int c, int d) {
		this(111,222);
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		ConstructorUsingThisKeyword ob = new ConstructorUsingThisKeyword(111,222,333,444);
	}
}
