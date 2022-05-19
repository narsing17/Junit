import org.jetbrains.annotations.NotNull;

public class DaysWeek {
    public static void main(String @NotNull [] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int y = year - (14 - month) / 12;
        int x = y + (y / 4) - (y / 100) + (y / 400);
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        String daysArr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day at " + day + "/" + month + "/" + year + " is " + daysArr[d]);


    }
}
