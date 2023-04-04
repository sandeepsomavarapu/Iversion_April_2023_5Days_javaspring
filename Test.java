package pack1;

public class Test {
	
	public void m1()
	{
		System.out.println("welcome to m1 method from test class");
	}
	
	
	
	public static void main(String[] args) {
			Test test=new Test();
			test.m1();
	}
}
class Child extends Test//parent class-->super class    child class-->sub class
{
	
public void m2()
{
	m1();
}

}
