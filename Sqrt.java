import java.util.Scanner;

public class Sqrt {
    static void sqrt() {
        double avg = 0;
        float epsilon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int c = sc.nextInt();

        double t = c;
        avg = ((c / t) + t) / 2;
        t = avg;
        epsilon = 1 * (float) java.lang.Math.exp(-15);

        while (Math.abs(t - (c / t)) > epsilon * t) {

        }
    }

    public static void main (String[]args){
        sqrt();
    }
}