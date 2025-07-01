package Day7.dayseven.overriding;

//Program to demonstrate method overriding - Runtime Polymorphism

//subclass
public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}
