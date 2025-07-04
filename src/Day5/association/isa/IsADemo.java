package C2TC_CORE_JAVA_PROGRAM.src.Day5.association.isa;

// Usage of the "IS-A" relationship 

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}