package C2TC_CORE_JAVA_PROGRAM.src.Day6.staticvariable;

//Program to demonstrate static variables

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		System.out.println(Employee.companyName);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}