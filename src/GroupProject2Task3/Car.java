package GroupProject2Task3;

public class Car {

    double carPrice;

    String color;

    Car(double carPrice, String color) {
        this.carPrice=carPrice;
        this.color=color;
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {

    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    double calculateSalePrice() {
        if(length>20) {
            carPrice=carPrice*0.95;
        }
        else {
            carPrice=carPrice*0.9;
        }

        return carPrice;
    }


}

class Truck extends Car {

    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    double calculateSalePrice() {
        if(weight>2000) {
            carPrice=carPrice*0.9;
        }
        else {
            carPrice=carPrice*0.8;
        }

        return carPrice;
    }

}
