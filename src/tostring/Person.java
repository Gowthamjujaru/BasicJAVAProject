package tostring;

public class Person {
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println(p); // implicitly it calls tostring();
	System.out.println(p.toString());  // explicitly we calls tostring()
	}

}
