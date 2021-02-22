public class Circumference {
    public static void main(String[] args) {
        Circle c = new Circle(20);
        System.out.println("Diameter = " + c.diameter());
        System.out.println("Circumference = " + c.circumference());
    }
}