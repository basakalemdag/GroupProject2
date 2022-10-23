package GroupProject2Task2;

public class B extends Marks{

    double grade4;

    B (double grade1, double grade2, double grade3, double grade4) {
        super(grade1, grade2, grade3);
        this.grade4=grade4;
    }

    double getPercentage() {
        double avg = (grade1+grade2+grade3+grade4)/4;
        System.out.println("The average for Student B is "+avg);
        return avg;
    }
}
