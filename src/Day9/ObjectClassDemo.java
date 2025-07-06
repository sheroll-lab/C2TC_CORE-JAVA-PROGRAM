package C2TC_CORE_JAVA_PROGRAM.src.Day9;

public class ObjectClassDemo {

    // Simple class extending Object implicitly
    static class Sample {
    }

    // Class to demonstrate finalize
    static class Demo {
        public Demo() {
            // resource allocation
            System.out.println("In Constructor");
        }

        @Override
        protected void finalize() throws Throwable {
            // resource cleanup code
            System.out.println("In Finalize");
        }
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        Sample s1 = new Sample();

        // Object class methods
        System.out.println("Class Name: " + s.getClass().getName());
        System.out.println("HashCode of s: " + s.hashCode());
        System.out.println("HashCode of s1: " + s1.hashCode());

        Demo d = new Demo();
        System.out.println("HashCode of d: " + d.hashCode());

        Demo d1 = d;  // Same reference
        System.out.println("HashCode of d1: " + d1.hashCode());

        d = null;     // Remove reference to d

        // Suggest garbage collection (not guaranteed)
        System.gc();

        System.out.println("d1 still points to: " + d1);
    }
}
