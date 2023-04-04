import java.util.Date;

public class MethodsEx {
	public int addOfTwo(int a, int b) {
		int result = a + b;
		return result;
	}
	public void subOfTwo(int a, int b) {
		int result = a - b;
		System.out.println("sub of two numbers : " + result);
	}
	public static void mulOfTwo() {
		int result = 20 * 30;
		System.out.println("mul of two numbers : " + result);
	}
	public static int divOfTwo(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		mulOfTwo();
		System.out.println("div of two numbers : "+MethodsEx.divOfTwo(20, 4));
		MethodsEx obj = new MethodsEx();
		obj.subOfTwo(22, 12);//static data		
		System.out.println("add of two numbers : " + obj.addOfTwo(12, 13));
		
		Date date=new Date();
		
		System.out.println(date);
	
	}
}
