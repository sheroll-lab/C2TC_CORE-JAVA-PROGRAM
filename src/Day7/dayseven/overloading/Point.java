package Day7.dayseven.overloading;

public class Point {
    private float x;
    private float y;

    // Default constructor (0, 0)
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // One-parameter constructor (x = y = value)
    public Point(float value) {
        this.x = value;
        this.y = value;
    }

    // Two-parameter constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Method to calculate distance from origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // String representation
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
