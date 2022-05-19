import java.util.Scanner;

public class Temperature {
    static void temperatureConversion() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = sc.nextDouble();
        System.out.println("Enter the unit of temp. F or fahrenheit and C for celsius");
        char unit = ' ';
        unit = sc.next().charAt(0);

        if (unit == 'F') {
            double tempCel = ((temp - 32) * 5) / 9;
            System.out.println("Temperature in celsius is: " + tempCel);
        } else if (unit == 'C') {
            double tempFah = (temp * 9) / 5 + 32;
            System.out.println("Temperature in Fahrenheit is: " + tempFah);
        } else {
            System.out.println("Enetr the proper unit");
        }
    }

    public static void main(String[] args) {

        Temperature.temperatureConversion();
    }
}
