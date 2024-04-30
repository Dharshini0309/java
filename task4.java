import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int number = scan.nextInt();

        String weekday = getWeekdayName(number);
        System.out.println("Weekday: " + weekday);

        scan.close();
    }

    public static String getWeekdayName(int number) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        if (number >= 1 && number <= 7) {
            return weekdays[number - 1];
        } else {
            return "Invalid input";
        }
    }
}
