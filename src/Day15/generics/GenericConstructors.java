package C2TC_CORE_JAVA_PROGRAM.src.Day15.generics;

public class GenericConstructors {
    private double v;

    //Generic Constructors
    public <T extends Number>GenericConstructors(T t)
    {
        v=t.doubleValue();
    }
    void show()
    {
        System.out.println("Value of v in double type is: "+v);
    }

}
