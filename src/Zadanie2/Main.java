public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7, "pink", "green");
        Rectangle rectangle = new Rectangle(3, 8, "purple", "white");
        Triangle triangle = new Triangle(3, 5, 7, "red", "orange");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill color: " + circle.getFillColor());
        System.out.println("Border color: " + circle.getBorderColor());

        System.out.println("\nRectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill color: " + rectangle.getFillColor());
        System.out.println("Border color: " + rectangle.getBorderColor());

        System.out.println("\nTriangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill color: " + triangle.getFillColor());
        System.out.println("Border color: " + triangle.getBorderColor());
    }
}
