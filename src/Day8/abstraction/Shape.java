package Day8.abstraction;

//Program to define abstract class


//abstract class
public abstract class Shape {
     protected float area;
     public float area;
     
     //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
	 