package Pckage1;

public class ThisKeywordwhenVariableNamesareSame {
	int age;
	public void m1(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		ThisKeywordwhenVariableNamesareSame s = new ThisKeywordwhenVariableNamesareSame();
		s.m1(45);
		System.out.println("Age is "+s.age);
	}
}
