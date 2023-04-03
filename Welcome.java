
public class Welcome {
	float marks = 98.56f;// global variable-->instance
	static int countryCode = 111;// global variable-->static

	public static void main(String[] args) {

		double salary = 23.562398765437;// local variables

		System.out.println("welcome to eclipse ...." +salary);

		System.out.println(Welcome.countryCode);

		Welcome wel = new Welcome();// 1 object creation
		System.out.println(wel.marks);

	}
}
//ctrl+space-->for suggestions
//ctrl+/ -->for comments
//ctrl+shift+f -->for formatting