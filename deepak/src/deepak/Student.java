package deepak;

public class Student {
	int age, rollno;
	
	public  void display1() {
		System.out.println("Welcome to all of you");
	}
	public  void display2() {
		System.out.println("Automation is very easy	");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a1 = new Student ();
		Student a2 = new Student ();
		a1.display1();
		a1.age = 28;
		
		a2.display2();
		a2.rollno = 40;
		
		System.out.println("Age - " + a1.age);
		System.out.println( "Roll No. - " + a2.rollno);
	}

}
