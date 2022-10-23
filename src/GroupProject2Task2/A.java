package GroupProject2Task2;

public class A extends Marks {

    A (double grade1, double grade2, double grade3) {
        super(grade1, grade2, grade3);
    }

    double getPercentage() {
        double avg = (grade1+grade2+grade3)/3;
        System.out.println("The average for Student A is "+avg);
        return avg;
    }
}
