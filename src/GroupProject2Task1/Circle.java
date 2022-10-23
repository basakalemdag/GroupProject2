package GroupProject2Task1;

public class Circle implements Shape {

    public void calculateArea(int a) {
        System.out.println("The area of the circle is "+(Math.PI*Math.pow(a, 2)));
    }

    public void calculatePerimeter(int a) {

        System.out.println("The perimeter of the circle is "+(Math.PI*a*2));
    }
}
