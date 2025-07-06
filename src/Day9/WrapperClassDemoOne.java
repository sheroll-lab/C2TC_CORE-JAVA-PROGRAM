package C2TC_CORE_JAVA_PROGRAM.src.Day9;


public class WrapperClassDemoOne {
	public static void main(String[] args) {
		// Unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);

		// Without using intValue()
		int c = i;
		System.out.println(c);
		
		//Autoboxing
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
	}
}


