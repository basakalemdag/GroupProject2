package GroupProject2Task3;

public class CarTest {

    public static void main(String[] args) {


        Sedan sedan = new Sedan(100, "black", 25);

        Truck truck = new Truck(100, "white", 3000);

        System.out.println(sedan.calculateSalePrice());

        System.out.println(truck.calculateSalePrice());
    }
}
