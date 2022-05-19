import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("you want change of Rs: ");
        int rupees = sc.nextInt();
        double numNotes = 0;
        int leftAmount;
        int totalNotes;
        int amount;

        int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};

        for (int i = 0; i <= notes.length; i++) {
            if (notes[i] <= rupees) {
                numNotes = (rupees / notes[i]);
                amount = (int)numNotes * notes[i];
                totalNotes = (int)numNotes;
                System.out.println("Number of notes of " + notes[i] + " are " + totalNotes);

                if (rupees%notes[i] == 0) {
                    break;

                } else {
                    leftAmount = rupees - amount;
                    rupees = leftAmount;
                }
            }
        }
    }
}
