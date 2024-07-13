package test;

public class UnitTest {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = a + b;
		
		System.out.println(c);
		System.out.println(testOne(10,5));
	}
	
	public static int testOne (int a, int b) {
		return a-b;
	}
	
	
}
