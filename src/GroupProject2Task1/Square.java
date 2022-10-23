package GroupProject2Task1;

public class Square implements Shape {

    public void calculateArea(int a) {
        System.out.println("The area of the square is "+(a*a));
    }

    public void calculatePerimeter(int a) {

        System.out.println("The perimeter of the square is "+(a*4));
    }
}
