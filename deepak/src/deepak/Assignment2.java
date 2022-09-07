package deepak;

 //
///problem (((((10*2)-2)+2)-2)/2)

public class Assignment2 {
	public static int sum (int a , int b) {
		int sum = a+b;
		return sum;
	}
	public static  int sub (int a , int b) {
		int sub = a-b;
		return sub;
	}
	public static  int multi (int a , int b) {
		int multi = a*b;
		return multi;
	}
	public static int div (int a , int b) {
		int div = a/b;
		return div;
	}
	

public static void main(String[] args) {
	int res1,res2,res3,res4,output;
	res1 = multi(10,2); System.out.println(res1);
	res2 = sub(res1,2); System.out.println(res2);
	res3 = sum(res2,2); System.out.println(res3);
	res4 = sub(res3,2); System.out.println(res4);
	output = div(res4,2); System.out.println(output);
	System.out.println( "result of problem (((((10*2)-2)+2)-2)/2) is :" + output);
}
}
