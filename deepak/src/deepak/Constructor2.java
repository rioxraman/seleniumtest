package deepak;

public class Constructor2 {
	public Constructor2() {
		this(4, 5 , 4.2);
		System.out.println("This is default constructor");
	}

	public Constructor2(int a) {
		this(6,7, 5.2 , 20.2) ;
		System.out.println("This is one paramaterised constructor");
	}

	public Constructor2(int a,int b) {
		this();
		System.out.println("This is two paramaterised constructor");
	}
	public Constructor2(int a,int b, double c) {
		
		System.out.println("This is three paramaterised constructor");
	}

	public Constructor2(int a, int b, double c, double d) {
		this(4,5);
		System.out.println("This is four paramaterised constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 delta= new Constructor2(4);//
	}

}
