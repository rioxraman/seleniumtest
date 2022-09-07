package deepak;

public class Constructor1 {
	public Constructor1() {
		this(4, 5 , 4.2);
		System.out.println("This is default constructor");
	}

	public Constructor1(int a) {
		this();
		System.out.println("This is one paramaterised constructor");
	}

	public Constructor1(int a,int b) {
		this(4);
		System.out.println("This is two paramaterised constructor");
	}
	public Constructor1(int a,int b, double c) {
		
		System.out.println("This is three paramaterised constructor");
	}

	public Constructor1(int a, int b, double c, double d) {
		this(4,5);
		System.out.println("This is four paramaterised constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 delta= new Constructor1(6,7, 5.1 , 10.1) ;
	}

}
