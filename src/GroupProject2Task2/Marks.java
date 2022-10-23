package GroupProject2Task2;

abstract public class Marks {

    double grade1;
    double grade2;
    double grade3;

    Marks(double grade1, double grade2, double grade3) {
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    abstract double getPercentage();
}
