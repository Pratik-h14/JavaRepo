package Pckage1;

public class Student {

	int age;
	int rollNo; 
	
	public void display1() {
		System.out.println("This is the first method");
	}
	public void display2() {
		System.out.println("This is the second method");
	}
	
	public static void main(String[]args) {
		Student obj1 = new Student();
		obj1.age = 26;
		obj1.rollNo = 5;
		System.out.println("1st Student's age is "+obj1.age);
		System.out.println("1st Student's roll no is "+obj1.rollNo); 
		obj1.display1();
		obj1.display2();
		
		Student obj2 = new Student();
		obj2.age = 24;
		obj2.rollNo = 9;
		System.out.println("2nd Student's age is "+obj2.age);
		System.out.println("2nd Student's roll no is "+obj2.rollNo);
		obj2.display1();
		obj2.display2();
	}
}
